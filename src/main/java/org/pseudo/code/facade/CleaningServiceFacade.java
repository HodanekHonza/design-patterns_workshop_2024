package org.pseudo.code.facade;

import java.util.Date;
import java.util.UUID;

public class CleaningServiceFacade {
    private CleaningService cleaningService;

    public CleaningServiceFacade() {
        this.cleaningService = new CleaningService();
    }

    public void scheduleCleaning(UUID roomUUID, Date endDate) {
        // other business logic that's inside facade
        cleaningService.scheduleCleaning(roomUUID, endDate);
    }
}
