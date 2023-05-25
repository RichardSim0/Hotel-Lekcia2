package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    String name;
    int room;
    LocalDate arrival;
    LocalDate departure;

    public Booking(String name, int room, LocalDate arrival, LocalDate departure) {
        this.name = name;
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name= " + name +
                ", room= " + room +
                ", arrival= " + arrival +
                ", departure= " + departure +
                '}';
    }
}