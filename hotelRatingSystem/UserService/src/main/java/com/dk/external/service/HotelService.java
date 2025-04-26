package com.dk.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dk.userService.entities.Hotel;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService {

     @GetMapping("hotels/{id}")
     Hotel getHotel(@PathVariable String id);
    
}
