package com.engeto;

import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int beds;
    private boolean balcony;
    private boolean seaView;
    private BigDecimal pricePerNight;

    public Room(int roomNumber, int beds, boolean balcony, boolean seaView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

}