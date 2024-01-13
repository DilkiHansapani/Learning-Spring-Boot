package com.in28minutes.rest.webservices.restfulwebservices06.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

public class User {

    private int id;
    @Size(min = 3, message = "Name should have at least 3 character")
    private String name;
    //@Past-when a date
    private int birthdate;

    public User(int id, String name, int birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
