package com.dk.RatingService.service;

import java.util.List;

import com.dk.RatingService.entities.Rating;

public interface IRatingService {

    // create user
    public Rating createRating(Rating rating);

    // get all rating 
    public List<Rating> getAllRatings();
    
    // get rating  by user id 

    public List<Rating> getRatingByUserId(String userId);
    // get rating by hotel id
    public List<Rating> getRatingByHotelId(String hotelId); 
}
