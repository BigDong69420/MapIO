package com.example.mapio;

import android.location.Location;

public class Customlandmark {
    private String name;
    private String state;
    private String country;
    private double latitude;
    private double longitude;


    public Customlandmark() {}

    public Customlandmark(String name, String state, String country, boolean capital, long population,double latitude,double longitude) {
        // ...
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }



}

