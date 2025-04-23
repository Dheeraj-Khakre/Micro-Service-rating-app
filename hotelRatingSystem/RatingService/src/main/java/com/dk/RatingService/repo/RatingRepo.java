package com.dk.RatingService.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dk.RatingService.entities.Rating;
@Repository
public interface RatingRepo extends MongoRepository<Rating, String> {
    
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
    
}
