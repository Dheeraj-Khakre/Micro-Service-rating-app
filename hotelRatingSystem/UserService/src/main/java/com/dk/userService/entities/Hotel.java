package com.dk.userService.entities;




public class Hotel {

    private Integer id;
    private String name;
    private String location;
    private String aboutHotel;
    public Hotel(Integer id, String name, String location, String aboutHotel) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.aboutHotel = aboutHotel;
    }
    public Hotel() {
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setAboutHotel(String aboutHotel) {
        this.aboutHotel = aboutHotel;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getAboutHotel() {
        return aboutHotel;
    }

}