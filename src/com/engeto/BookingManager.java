package com.engeto;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings(){
        return new ArrayList<>(bookings);
    }
    public void add(Booking newBooking){
        bookings.add(newBooking);
    }

    public void getNumberOfBookings(){
        System.out.println(bookings.size());
    }
    public void getNumberOfWorkingBookings(){
        if (bookings.contains(TypeOfVacation.WORKING));
    }

    @Override
    public String toString() {
        return "BookingManager{" +
                "bookings=" + bookings +
                '}';
    }
}