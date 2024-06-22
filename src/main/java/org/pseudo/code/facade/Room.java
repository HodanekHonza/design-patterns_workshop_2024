package org.pseudo.code.facade;

import java.util.Date;
import java.util.UUID;

public class Room {
    private CleaningServiceFacade cleaningServiceFacade;
    private final UUID rooomUUID;
    private boolean occupied;

    public Room(String roomType) {
        this.cleaningServiceFacade = new CleaningServiceFacade();
        this.rooomUUID = UUID.randomUUID();
        // Initialize room based on room type
    }

    public void setOccupied(Date endDate) {
        this.occupied = true;
        cleaningServiceFacade.scheduleCleaning(rooomUUID, endDate);
    }

    public UUID getUUID() {
        return rooomUUID;
    }
}


