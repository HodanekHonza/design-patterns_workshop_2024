package org.pseudo.code.command;

import java.util.Date;

// Reservation Info Class
public class ReservationInfo {
    private String guest;
    private String roomType;
    private boolean needsParking;
    private Date startDate;
    private Date endDate;

    public ReservationInfo(String guest, boolean needsParking, Date endDate, Date startDate) {
        this.guest = guest;
        this.needsParking = needsParking;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    // Getters and setters
    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean needsParking() {
        return needsParking;
    }

    public void setNeedsParking(boolean needsParking) {
        this.needsParking = needsParking;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

