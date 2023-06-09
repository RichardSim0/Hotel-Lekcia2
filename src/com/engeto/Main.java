package com.engeto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingManager = new BookingManager();
        List<Guest> guestsList = new ArrayList<>();
        List<Room> roomsList = new ArrayList<>();
//        ***HOSTIA***
        guestsList.add(new Guest("Adéla","Malíková", LocalDate.of(1993, 3, 13)));
        guestsList.add(new Guest("Ján","Dvořáček", LocalDate.of(1995, 5, 5)));
        guestsList.add(new Guest("Karel","Dvořák",LocalDate.of(1990,5,15)));
        guestsList.add(new Guest("Karel","Dvořák",LocalDate.of(1979,1,3)));
        guestsList.add(new Guest("ABC Relax","",null));
        guestsList.add(new Guest("Alena","Krásová",LocalDate.of(1989,3,12)));
//        ***IZBY***
        roomsList.add(new Room(1, 1, true, true, BigDecimal.valueOf(1000)));
        roomsList.add(new Room(2, 1, true, true, BigDecimal.valueOf(1000)));
        roomsList.add(new Room(3, 3, false, true, BigDecimal.valueOf(2400)));
//        ***BOOKINGMANAGER***
        bookingManager.add(new Booking(roomsList.get(0),guestsList.get(0), guestsList.subList(0,1),
                LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),TypeOfVacation.RECREATIONAL));
        bookingManager.add(new Booking(roomsList.get(2),guestsList.get(0), guestsList.subList(0,2),
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.RECREATIONAL));
        bookingManager.add(new Booking(roomsList.get(2),guestsList.get(2), guestsList.subList(2,3),
                LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), TypeOfVacation.WORKING));
        bookingManager.add(new Booking(roomsList.get(2),guestsList.get(3), guestsList.subList(3,4),
                LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), TypeOfVacation.RECREATIONAL));
        int den1=2;
        int month=6;
        for (int den = 1; den <= 30; den++) {
            if (den1 ==31){
                den1 = 1;
                if (den1 == 1){
                    month++;
                }
            }
            bookingManager.add(new Booking(roomsList.get(1),guestsList.get(4), guestsList.subList(4,5),
                    LocalDate.of(2023, 6, den), LocalDate.of(2023, month, den1), TypeOfVacation.RECREATIONAL));
            den1++;
        }
        for (int i = 6; i <= 12; i++) {
            bookingManager.add(new Booking(roomsList.get(0),guestsList.get(5), guestsList.subList(5,6),
                    LocalDate.of(2023, i, 1), LocalDate.of(2023, i, 5), TypeOfVacation.WORKING));
        }

        LocalDate startDate = LocalDate.of(2023, 8, 1);
        for (int i = 0; i < 4; i++) {
            LocalDate checkInDate = startDate.plusDays(i * 7);
            LocalDate checkOutDate = checkInDate.plusDays(3);
            bookingManager.add(new Booking(roomsList.get(1),guestsList.get(4), guestsList.subList(4,5), checkInDate, checkOutDate,TypeOfVacation.WORKING));
        }

//      ......Výpis všetkých rezervácii.....
        bookingManager.getNumberOfBookings();
        for (Booking booking : bookingManager.getBookings()) {
            if (booking.getRoom().getRoomNumber() == 1) {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() + " (" + booking.getGuest().getDateOfBirth() + ")[1, ano]");
            } else if (booking.getRoom().getRoomNumber() == 2) {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() + " (" + booking.getGuest().getDateOfBirth() + ")[1, ano]");
            } else {
                System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() +", "+ booking.getOtherGuests() + " (" + booking.getGuest().getDateOfBirth() + ")[3, ano]");
            }
        }

//      ......Průměrný počet hostů na rezervaci.....
        int totalGuests = 0;
        int totalBookings = bookingManager.getBookings().size();

        for (Booking booking : bookingManager.getBookings()) {
            totalGuests += booking.getOtherGuests().size();
        }
        BigDecimal averageGuests = BigDecimal.valueOf(totalGuests)
                .divide(BigDecimal.valueOf(totalBookings), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Average guests per booking: " + averageGuests);

//      ......Prvních osm rekreačních rezervací.....
        int count = 0;
        for (Booking booking : bookingManager.getBookings()) {
            if (booking.getTypeOfVacation() == TypeOfVacation.RECREATIONAL) {
                System.out.println(booking);
                count++;
            }
            if (count == 8) break;
        }

//        ......Počet jednodenních, dvoudenních a vícedenních pobytů.....
        long numOfNights;
        for (Booking booking : bookingManager.getBookings()) {
            LocalDate arrivalDate = booking.getArrival();
            LocalDate departureDate = booking.getDeparture();
            numOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
        if (numOfNights==1){
            System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() + " (" + booking.getGuest().getDateOfBirth() + ")[1, ano]" + "POČET NOCÍ: " + numOfNights);
        } else if (numOfNights == 2) {
            System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() + " (" + booking.getGuest().getDateOfBirth() + ")[1, ano]" + "POČET NOCÍ: " + numOfNights);
        }else System.out.println(booking.getArrival() + " až " + booking.getDeparture() + ": " + booking.getGuest().getWholeName() + " (" + booking.getGuest().getDateOfBirth() + ")[1, ano]" + "POČET NOCÍ: " + numOfNights);
        }

//        ......Cena objednávek......
        for (Booking booking : bookingManager.getBookings()){
            LocalDate arrivalDate = booking.getArrival();
            LocalDate departureDate = booking.getDeparture();
            numOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
            BigDecimal priceForBooking = BigDecimal.valueOf(numOfNights).multiply(booking.getRoom().getPricePerNight());
            if (numOfNights==1){
                System.out.println(booking.getGuest().getWholeName() + " (pokoj " + booking.getRoom().getRoomNumber() + "): " + numOfNights + "noc od " + booking.getArrival() +" za "+ priceForBooking + "Kč");
            } else if (numOfNights > 1 && numOfNights < 5){
                System.out.println(booking.getGuest().getWholeName() + " (pokoj " + booking.getRoom().getRoomNumber() + "): " + numOfNights + "noci od " + booking.getArrival() +" za "+ priceForBooking + "Kč");
            }else System.out.println(booking.getGuest().getWholeName() + " (pokoj " + booking.getRoom().getRoomNumber() + "): " + numOfNights + "nocí od " + booking.getArrival() +" za "+ priceForBooking + "Kč");
        }
    }
}