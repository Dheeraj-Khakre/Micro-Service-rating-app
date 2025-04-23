package com.dk.userService.entities;



public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedback;
    private Hotel hotel;

    public Rating(String feedback, Hotel hotel, String hotelId, String rating, String ratingId, String userId) {
        this.feedback = feedback;
        this.hotel = hotel;
        this.hotelId = hotelId;
        this.rating = rating;
        this.ratingId = ratingId;
        this.userId = userId;
    }

    public Rating() {
    }

    public String getRatingId() {
        return ratingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getRating() {
        return rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

   

}
