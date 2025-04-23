package com.dk.RatingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.RatingService.entities.Rating;
import com.dk.RatingService.repo.RatingRepo;
@Service
public class RatingService implements IRatingService {
    
    private final RatingRepo ratingRepo;

    public RatingService(RatingRepo ratingRepo) {
        this.ratingRepo = ratingRepo;
    }
    

    @Override
    public Rating createRating(Rating rating) {
           
        return ratingRepo.save(rating);
        }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepo.findAll();
         }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
         
        return ratingRepo.findByUserId(userId);
         }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
    
}
