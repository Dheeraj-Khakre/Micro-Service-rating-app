package com.dk.userService.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;


@Entity
public class Users {
    @Id
    @SequenceGenerator(name = "users_sequence", allocationSize = 1, sequenceName = "users_sequence")
    @GeneratedValue(generator = "users_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String email;
    private String aboutUser;
    @Transient
    private List<Rating> ratings=new ArrayList<>(); 

    public Users( Integer id, String name, String email, String aboutUser) {
        this.aboutUser = aboutUser;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
