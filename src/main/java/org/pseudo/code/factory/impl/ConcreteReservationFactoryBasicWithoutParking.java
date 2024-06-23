package org.pseudo.code.factory.impl;

import org.pseudo.code.command.ReservationInfo;
import org.pseudo.code.facade.Room;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;

public class ConcreteReservationFactoryBasicWithoutParking implements ReservationFactory {
    @Override
    public Reservation createReservation(ReservationInfo info) {
        // Pseudo-code for checking room availability
        boolean isRoomAvailable = checkRoomAvailability(info);

        // If the room is available, create a reservation
        if (isRoomAvailable) {
            Room room = new Room(info.getRoomType());
            return new Reservation(info.getGuest(), "Basic", room, false, info.getStartDate(), info.getEndDate());
        } else {
            // Handle room unavailability (e.g., throw an exception or return null)
            throw new RoomUnavailableException("No basic room without parking is available for the specified dates.");
        }
    }

    // Pseudo-code for the method to check room availability
    private boolean checkRoomAvailability(ReservationInfo info) {
        // Query the database to find if any room of the requested type is available during the requested dates
        // This is just pseudo-code and should be replaced with actual database access logic
        String query = "SELECT * FROM rooms WHERE type = ? AND is_available = true AND ? BETWEEN start_date AND end_date";
        Object[] params = {info.getRoomType(), info.getStartDate(), info.getEndDate()};

        // Execute the query and check if there are any available rooms
        // This is a placeholder for actual database interaction code
        List<Room> availableRooms = jdbcTemplate.query(query, params, new RoomRowMapper());

        // If the list of available rooms is not empty, return true
        return !availableRooms.isEmpty();
    }
}
