package org.pseudo.code.facade;

import java.util.Date;
import java.util.UUID;

public class CleaningService {
    public void scheduleCleaning(UUID roomNumber, Date endDate) {
        // Schedule cleaning logic, for simplicity let's just print the scheduling
        System.out.println("Cleaning for room " + roomNumber + " scheduled after " + endDate);
    }
}
