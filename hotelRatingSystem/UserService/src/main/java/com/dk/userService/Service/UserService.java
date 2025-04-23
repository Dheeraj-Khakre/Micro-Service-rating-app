package com.dk.userService.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dk.external.service.HotelService;
import com.dk.external.service.RatingService;
import com.dk.userService.Repo.UserRepo;
import com.dk.userService.Service.Exception.ResourceNotFoundException;
import com.dk.userService.entities.Hotel;
import com.dk.userService.entities.Rating;
import com.dk.userService.entities.Users;

@Service
public class UserService implements IUserService {

    private final RestTemplate restTemp;
    private final Logger logger;
    private final UserRepo userRepo;
    private final HotelService hotelService;
    private final RatingService ratingService;

    public UserService(RatingService  ratingService,Logger logger, RestTemplate resttemp, UserRepo userRepo, HotelService hotelService) {
        this.logger = logger;
        this.restTemp = resttemp;
        this.userRepo = userRepo;
        this.hotelService = hotelService;
        this.ratingService = ratingService;
    }

    @Override
    public Users creatUsers(Users user) {

        return userRepo.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @SuppressWarnings({ "unchecked", "null" })
    @Override
    public Users getUsersById(Integer id) {
        Users user = userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("user not found  on given id  !!" + id));

        

  // ResponseEntity<List<Rating>> response  =resttemp.exchange("http://RATINGSERVICE/ratings/users/" + user.getId(), HttpMethod.GET,null,new ParameterizedTypeReference<List<Rating>>() {});
 
        
        List<Rating> Ratings = ratingService.getRatngByUser(user.getId().toString()).stream().map(rating->{
            // call hotel api ...
            Hotel hotel = hotelService.getHotel(rating.getHotelId());

                
               //     resttemp.getForEntity("http://HOTELSERVICE/hotels/" + rating.getHotelId(), Hotel.class).getBody(); 
            rating.setHotel(hotel);
            return  rating;
        }).collect(Collectors.toList());


        logger.info("", Ratings);
        user.setRatings(Ratings);
        return user;

    }

}
