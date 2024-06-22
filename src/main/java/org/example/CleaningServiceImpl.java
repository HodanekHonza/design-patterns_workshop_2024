package org.example;

public class CleaningServiceImpl implements CleaningService {
    @Override
    public void clean(int roomNumber) {
        // Logic to clean the room
        System.out.println("Room " + roomNumber + " cleaned.");
    }
}

