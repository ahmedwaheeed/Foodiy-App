package com.ahmed.waheed.project.firebase.fooddelivaryapp;

public class orderAgainModel {

    String RestaurantName;
    String foodPrice;
    String foodDetails;

    public orderAgainModel(String RestaurantName, String foodPrice, String foodDetails) {
        this.RestaurantName = RestaurantName;
        this.foodPrice = foodPrice;
        this.foodDetails = foodDetails;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodDetails() {
        return foodDetails;
    }

    public void setFoodDetails(String foodDetails) {
        this.foodDetails = foodDetails;
    }
}
