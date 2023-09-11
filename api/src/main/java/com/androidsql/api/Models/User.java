package com.androidsql.api.Models;

import jakarta.persistence.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private double home_lat;

    @Column
    private double home_long;

    @Column
    private String android_id;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getHome_lat() {
        return this.home_lat;
    }

    public void setHome_lat(double home_lat) {
        this.home_lat = home_lat;
    }

    public double getHome_long() {
        return this.home_long;
    }

    public void setHome_long(double home_long) {
        this.home_long = home_long;
    }

    public String getAndroid_id() {
        return this.android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }

}
