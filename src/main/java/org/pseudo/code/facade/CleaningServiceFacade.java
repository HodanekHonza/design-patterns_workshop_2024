package org.pseudo.code.facade;

import java.util.Date;
import java.util.UUID;

public class CleaningServiceFacade {
    private final CleaningService cleaningService;

    public CleaningServiceFacade() {
        this.cleaningService = new CleaningService();
    }

    public void scheduleCleaning(UUID roomUUID, Date endDate) {
        // Check if the room is occupied
        if (cleaningService.isRoomOccupied(roomUUID)) {
            System.out.println("Room " + roomUUID + " is currently occupied.");

            // Schedule cleaning based on room status
            if (cleaningService.needsCleaning(roomUUID)) {
                cleaningService.scheduleCleaning(roomUUID, endDate);
            } else {
                System.out.println("Room " + roomUUID + " does not need cleaning. No cleaning scheduled.");
            }
        } else {
            System.out.println("Room " + roomUUID + " is not occupied. No cleaning scheduled.");
        }
    }
}
