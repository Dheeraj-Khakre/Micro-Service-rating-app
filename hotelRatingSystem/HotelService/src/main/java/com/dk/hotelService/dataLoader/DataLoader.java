package com.dk.hotelService.dataLoader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dk.hotelService.entities.Hotel;
import com.dk.hotelService.repo.HotelRepo;


@Component
public class DataLoader implements CommandLineRunner {

    private final HotelRepo hotelRepository;

    
    public DataLoader(HotelRepo hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        hotelRepository.save(new Hotel(null, "Jehan Numa Palace Hotel", "Bhopal",
                "A luxurious heritage hotel with modern amenities and beautiful gardens"));
        hotelRepository.save(new Hotel(null, "Courtyard by Marriott Bhopal", "Bhopal",
                "Offers a luxurious escape with a spacious pool and elegantly furnished rooms"));
        hotelRepository.save(new Hotel(null, "Jehan Numa Retreat", "Bhopal",
                "A serene retreat with lush greenery and modern facilities"));
        hotelRepository.save(new Hotel(null, "Hotel Aditya Residency", "Bhopal",
                "A comfortable stay with private balconies and a restaurant"));
        hotelRepository.save(
                new Hotel(null, "Taj Lakefront Bhopal", "Bhopal", "A luxurious hotel with stunning views of the lake"));
        hotelRepository
                .save(new Hotel(null, "Golden Tulip Bhopal", "Bhopal", "Offers modern amenities and a comfortable stay"));
        hotelRepository.save(
                new Hotel(null, "Hotel Atishay Bhopal", "Bhopal", "A well-rated hotel with good facilities and service"));
        hotelRepository.save(new Hotel(null, "Radisson Hotel Bhopal", "Bhopal",
                "A premium hotel with excellent amenities and service"));
        hotelRepository.save(new Hotel(null, "Fairyland Clarks Inn", "Bhopal", "A comfortable stay with good facilities"));
        hotelRepository.save(
                        new Hotel(null, "Hotel Amer Palace", "Bhopal",
                                        "A well-known hotel with good service and amenities"));
                
         System.out.print(hotelRepository.findAll());                               
    }
}
