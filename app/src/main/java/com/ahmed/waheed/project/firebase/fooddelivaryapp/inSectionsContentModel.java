package com.ahmed.waheed.project.firebase.fooddelivaryapp;

public class inSectionsContentModel {

    String imageUrl;
    String RestaurantName;
    String Rating;
    String typeOfOrders;
    String DeliveryFees;
    String DurationOfDelivery;

    public inSectionsContentModel(String imageUrl, String restaurantName, String rating, String typeOfOrders, String deliveryFees, String durationOfDelivery) {
        this.imageUrl = imageUrl;
        RestaurantName = restaurantName;
        Rating = rating;
        this.typeOfOrders = typeOfOrders;
        DeliveryFees = deliveryFees;
        DurationOfDelivery = durationOfDelivery;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getTypeOfOrders() {
        return typeOfOrders;
    }

    public void setTypeOfOrders(String typeOfOrders) {
        this.typeOfOrders = typeOfOrders;
    }

    public String getDeliveryFees() {
        return DeliveryFees;
    }

    public void setDeliveryFees(String deliveryFees) {
        DeliveryFees = deliveryFees;
    }

    public String getDurationOfDelivery() {
        return DurationOfDelivery;
    }

    public void setDurationOfDelivery(String durationOfDelivery) {
        DurationOfDelivery = durationOfDelivery;
    }
}
