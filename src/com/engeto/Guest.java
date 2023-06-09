package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    private String sureName;
    private LocalDate dateOfBirth;

    public Guest(String name, String sureName, LocalDate dateOfBirth) {
        this.name = name;
        this.sureName = sureName;
        this.dateOfBirth = dateOfBirth;
    }

    public Guest(String name) {
        this.name = name;
    }

    List<Guest> listOfGuests = new ArrayList<>();
    public void addGuest(Guest newGuest){
        listOfGuests.add(newGuest);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWholeName(){
        return name + " " + sureName;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}