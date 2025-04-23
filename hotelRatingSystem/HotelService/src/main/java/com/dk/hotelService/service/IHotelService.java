package com.dk.hotelService.service;

import java.util.List;

import com.dk.hotelService.entities.Hotel;

public interface IHotelService {
    
    public Hotel createHotel(Hotel hotel);

    public List<Hotel> getAllHotel();

    public Hotel getHotel(Integer id);
}
