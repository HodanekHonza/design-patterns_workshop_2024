package org.example;

// Concrete Factory for creating reservations
public class ConcreteReservationFactory implements ReservationFactory {
    public Reservation createReservation(ReservationInfo info) {
        Room room = new Room(info.getRoomType());
        ParkingSlot parkingSlot = null;
        if (info.needsParking()) {
            parkingSlot = new ParkingSlot();
        }
        return new Reservation(info.getGuest(), room, parkingSlot, info.getStartDate(), info.getEndDate());
    }
}
