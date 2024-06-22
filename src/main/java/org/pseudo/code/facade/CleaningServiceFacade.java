package org.pseudo.code.facade;

import org.pseudo.code.facade.cleaningserviceimpl.CleaningServiceImpl;

import java.util.Date;

public class CleaningServiceFacade {
    private CleaningService cleaningService;

    public CleaningServiceFacade() {
        this.cleaningService = new CleaningServiceImpl();
    }

    public void scheduleCleaning(int roomNumber, Date endDate) {
        cleaningService.scheduleCleaning(roomNumber, endDate);
    }
}
