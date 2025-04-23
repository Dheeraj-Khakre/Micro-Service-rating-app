package com.dk.hotelService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dk.hotelService.entities.Hotel;
import com.dk.hotelService.service.HotelService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/hotels")
public class HotelController {
    
    @Autowired
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getHotel() {
        List<Hotel> hotels = hotelService.getAllHotel();

        return ResponseEntity.ok(hotels);

    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getMethodName(@PathVariable Integer id) {
        Hotel hotel = hotelService.getHotel(id);
        return ResponseEntity.ok(hotel);
    }
    @PostMapping()
    public ResponseEntity<Hotel> postMethodName(@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.createHotel(hotel);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    
    
    

    
}
