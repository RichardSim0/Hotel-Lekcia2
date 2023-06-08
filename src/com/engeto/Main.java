package com.engeto;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingManager = new BookingManager();
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Ján","Dvořáček", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Karel","Dvořák",LocalDate.of(1990,5,15));
        Guest guest4 = new Guest("Karel","Dvořák",LocalDate.of(1979,1,3));
        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        Booking booking1 = new Booking("Adéla Malíková", 1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26));
        bookingManager.add(booking1);
        Booking booking2 = new Booking(guest1.getName()+" "+guest1.getSureName()+", "+guest2.getName()+" "+guest2.getSureName(),LocalDate.of(1993,3,13),3,
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        bookingManager.add(booking2);
        Booking booking3 = new Booking("Karel Dvořák", LocalDate.of(1990, 5, 15), 3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), TypeOfVacation.WORKING);
        bookingManager.add(booking3);
        Booking booking4 = new Booking("Karel Dvořák", LocalDate.of(1979, 1, 3), 2, LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), TypeOfVacation.RECREATIONAL);
        bookingManager.add(booking4);
        Booking booking5;
        for (int den = 1; den <= 30; den++) {
            booking5 = new Booking("ABC Relax", 2, LocalDate.of(2023, 6, den), LocalDate.of(2023, 6, den), TypeOfVacation.RECREATIONAL);
            bookingManager.add(booking5);
        }
        Booking booking6;
        for (int i = 6; i <= 12; i++) {
            booking6 = new Booking("Alena Krásová", 1, LocalDate.of(2023, i, 1), LocalDate.of(2023, i, 5), TypeOfVacation.WORKING);
            bookingManager.add(booking6);
        }

        String[] bookingDetails = {"ABC Relax", "ABC Relax", "ABC Relax", "ABC Relax"};

        LocalDate startDate = LocalDate.of(2023, 8, 1);

        for (int i = 0; i < bookingDetails.length; i++) {
            LocalDate checkInDate = startDate.plusDays(i * 7);
            LocalDate checkOutDate = checkInDate.plusDays(3);

            Booking booking7 = new Booking(bookingDetails[i], 2, checkInDate, checkOutDate);
            bookingManager.add(booking7);
        }

        for (Booking booking : bookingManager.getBookings()) {
            if (booking.getRoom() == 1) {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getName() + " (" + booking.getBorn() + ")[1, ano]");
            } else if (booking.getRoom() == 2) {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getName() + " (" + booking.getBorn() + ")[1, ano]");
            } else {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getName() + " (" + booking.getBorn() + ")[3, ano]");
            }
        }

        //Průměrný počet hostů na rezervaci.....
//        double guestAverage =...... / bookingManager.getBookings()
//        System.out.println(bookingManager.getBookings());

        if (bookingManager.getBookings().contains(TypeOfVacation.RECREATIONAL)) {
            for (int i=0; i<8;i++);

            System.out.println(bookingManager);
            }
    }
}