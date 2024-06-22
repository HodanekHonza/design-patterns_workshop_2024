package org.example;

import java.util.Date;

public class Room {
    private CleaningServiceFacade cleaningServiceFacade;
    private boolean occupied;

    public Room(String roomType) {
        this.cleaningServiceFacade = new CleaningServiceFacade();
        // Initialize room based on room type
    }

    public void setOccupied(Date startDate, Date endDate) {
        this.occupied = true;
        cleaningServiceFacade.scheduleCleaning(startDate, endDate);
    }
}


