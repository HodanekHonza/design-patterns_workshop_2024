package org.pseudo.code.facade.cleaningserviceimpl;

import org.pseudo.code.facade.CleaningService;

import java.util.Date;

public class CleaningServiceImpl implements CleaningService {
    @Override
    public void clean(int roomNumber) {
        // Logic to clean the room
        System.out.println("Room " + roomNumber + " cleaned.");
    }

    @Override
    public void scheduleCleaning(int roomNumber, Date endDate) {
        // Schedule cleaning logic, for simplicity let's just print the scheduling
        System.out.println("Cleaning for room " + roomNumber + " scheduled after " + endDate);
    }
}
