package com.dk.hotelService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.hotelService.entities.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {
    
}
