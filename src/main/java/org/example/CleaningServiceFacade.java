package org.example;

import java.util.Date;

public class CleaningServiceFacade {
    private CleaningService cleaningService;

    public CleaningServiceFacade() {
        this.cleaningService = CleaningService.getInstance();
    }

    public void scheduleCleaning(Date startDate, Date endDate) {
        cleaningService.scheduleCleaning(startDate, endDate);
    }
}

