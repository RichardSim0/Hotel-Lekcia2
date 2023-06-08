package com.engeto;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private LocalDate arrival;
    private LocalDate departure;
    private TypeOfVacation typeOfVacation;

    public Booking(Room room,Guest guest, List<Guest> otherGuests, LocalDate arrival, LocalDate departure, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.arrival = arrival;
        this.departure = departure;
        this.typeOfVacation = typeOfVacation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
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

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", guest=" + guest +
                ", otherGuests" + otherGuests +
                ", arrival=" + arrival +
                ", departure=" + departure +
                ", typeOfVacation=" + typeOfVacation +
                '}';
    }
}