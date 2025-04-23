package com.dk.hotelService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dk.hotelService.entities.Hotel;
import com.dk.hotelService.repo.HotelRepo;
import com.dk.hotelService.service.Exception.ResourceNotFoundException;

@Service
public class HotelService implements IHotelService {
    private final HotelRepo hotelRepo;

    public HotelService(HotelRepo hotelRepo) {
        this.hotelRepo = hotelRepo;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {

        return hotelRepo.save(hotel);
       
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    
    }

    @Override
    public Hotel getHotel(Integer id) {
            return   hotelRepo.findById(id)
                       .orElseThrow(() -> new ResourceNotFoundException("user not found  on given id  !!" + id));
       
    }
    
    
}
