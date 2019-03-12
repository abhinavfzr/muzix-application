package com.stackroute.userservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurent
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String restaurent_name;
    String restaurent_img;
    String restaurent_location;

    public Restaurent() {
    }

    public Restaurent(int id, String restaurent_name, String restaurent_img, String restaurent_location) {
        this.id = id;
        this.restaurent_name = restaurent_name;
        this.restaurent_img = restaurent_img;
        this.restaurent_location = restaurent_location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurent_name() {
        return restaurent_name;
    }

    public void setRestaurent_name(String restaurent_name) {
        this.restaurent_name = restaurent_name;
    }

    public String getRestaurent_img() {
        return restaurent_img;
    }

    public void setRestaurent_img(String restaurent_img) {
        this.restaurent_img = restaurent_img;
    }

    public String getRestaurent_location() {
        return restaurent_location;
    }

    public void setRestaurent_location(String restaurent_location) {
        this.restaurent_location = restaurent_location;
    }
}
