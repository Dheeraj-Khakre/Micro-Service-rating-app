package com.dk.RatingService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dk.RatingService.entities.Rating;
import com.dk.RatingService.service.RatingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRaString() {

        return ResponseEntity.ok(ratingService.getAllRatings());
    }
    
    @GetMapping("/users/{id}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String id) {

        return ResponseEntity.ok(ratingService.getRatingByUserId(id));
    }
    
    @GetMapping("/hotels/{id}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String id) {

        return ResponseEntity.ok(ratingService.getRatingByHotelId(id));
    }
    @PostMapping()
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating r = ratingService.createRating(rating);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(r);
    }
    
    
    
}
