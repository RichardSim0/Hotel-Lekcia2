package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Ján","Dvořáček",LocalDate.of(1995,5,5));
        Room room1 = new Room(1,1,true,true,1000);
        Room room2 = new Room(2,1,true,true,1000);
        Room room3 = new Room(3,3,false,true,2400);

        Booking booking1 = new Booking("Adéla Malíková",1,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26));
        Booking booking2 = new Booking("Adéla Malíková" + ", " + "Ján Dvořáček",3,
                LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));

        List<Booking> listOfBooking = new ArrayList<>();
        listOfBooking.add(booking1);
        listOfBooking.add(booking2);
        for (Booking booking: listOfBooking){
            System.out.println(booking);
        }
    }

}