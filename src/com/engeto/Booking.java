package com.engeto;

import java.time.LocalDate;

public class Booking {
    String name;
    LocalDate born;
    int room;
    LocalDate arrival;
    LocalDate departure;
    TypeOfVacation typeOfVacation;

    public Booking(String name, int room, LocalDate arrival, LocalDate departure) {
        this.name = name;
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;
            }

    public Booking(String name, LocalDate born, int room, LocalDate arrival, LocalDate departure, TypeOfVacation typeOfVacation) {
        this.name = name;
        this.born = born;
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(String name, int room, LocalDate arrival, LocalDate departure, TypeOfVacation typeOfVacation) {
        this.name = name;
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;
        this.typeOfVacation = typeOfVacation;
    }
    public Booking(String name, LocalDate born, int room, LocalDate arrival, LocalDate departure) {
        this.name = name;
        this.born = born;
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

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name= " + name +
                ", room= " + room +
                ", arrival= " + arrival +
                ", departure= " + departure +
                ", type of vacation= " + typeOfVacation+
                '}';
    }
}