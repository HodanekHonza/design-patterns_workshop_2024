package org.pseudo.code.factory.impl;

import org.pseudo.code.ParkingSlot;
import org.pseudo.code.facade.Room;
import org.pseudo.code.command.ReservationInfo;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;

// Concrete Factory for creating reservations
public class ReservationFactoryWithParking implements ReservationFactory {
    public Reservation createReservation(ReservationInfo info) {
        Room room = new Room(info.getRoomType());
        Boolean parkingSlot = true;
        return new Reservation(info.getGuest(), room, parkingSlot, info.getStartDate(), info.getEndDate());
    }
}
