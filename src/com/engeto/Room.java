package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room {
    int number;
    int beds;
    boolean balcony;
    boolean seaView;
    double pricePerNight;
    LocalDate dateOfAccommodation;

    public Room(int number, int beds, boolean balcony, boolean seaView, double pricePerNight) {
        this.number = number;
        this.beds = beds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }
    List<Room> listOfRooms = new ArrayList<>();
    public void addRoom(Room newRoom){
        listOfRooms.add(newRoom);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public LocalDate getDateOfAccommodation() {
        return dateOfAccommodation;
    }

    public void setDateOfAccommodation(LocalDate dateOfAccommodation) {
        this.dateOfAccommodation = dateOfAccommodation;
    }
}