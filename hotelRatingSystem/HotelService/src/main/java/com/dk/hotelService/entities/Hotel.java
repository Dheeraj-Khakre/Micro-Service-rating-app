package com.dk.hotelService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="hotels")
public class Hotel {

    public Hotel(Integer id, String name, String location, String aboutHotel) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.aboutHotel = aboutHotel;
    }
    @Id
    @SequenceGenerator(name = "users_sequence", allocationSize = 1, sequenceName = "users_sequence")
    @GeneratedValue(generator = "users_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String location;
    private String aboutHotel;

   
    
}
