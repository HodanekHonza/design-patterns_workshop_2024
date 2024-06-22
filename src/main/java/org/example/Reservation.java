package org.example;

import java.util.Date;

// Reservation Class
public class Reservation {
    private String guest;
    private Room room;

    private ParkingSlot parkingSlot;
    private Date startDate;
    private Date endDate;

    public Reservation(String guest, Room room, ParkingSlot parkingSlot, Date startDate, Date endDate) {
        this.guest = guest;
        this.room = room;
        this.parkingSlot = parkingSlot;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void assignRoom() {
        room.setOccupied(startDate, endDate);
    }
}
