package org.pseudo.code.factory;

import org.pseudo.code.facade.Room;

import java.util.Date;

public class Reservation {
    private String guest;
    private Room room;
    private String roomType;

    private Boolean parkingSlot;
    private Date startDate;
    private Date endDate;

    public Reservation(String guest, String roomType, Room room, Boolean parkingSlot, Date startDate, Date endDate) {
        this.guest = guest;
        this.roomType = roomType;
        this.room = room;
        this.parkingSlot = parkingSlot;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void assignRoom() {
        room.setOccupied(endDate);
    }
}
