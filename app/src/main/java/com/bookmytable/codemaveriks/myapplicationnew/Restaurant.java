package com.bookmytable.codemaveriks.myapplicationnew;


import java.util.List;

public class Restaurant {

    private String name;
    private String location;
    private String contactInfo;
    private int rating;
    private int restaurantOwnerID;
    private List<String> menu;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
