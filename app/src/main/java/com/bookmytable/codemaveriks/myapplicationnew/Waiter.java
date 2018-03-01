package com.bookmytable.codemaveriks.myapplicationnew;


import java.util.List;

public class Waiter {

    private String name;
    private String email;
    private String contactInfo;
    private List<Integer> restaurantIDList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
