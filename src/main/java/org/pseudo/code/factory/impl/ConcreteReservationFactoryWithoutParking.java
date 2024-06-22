package org.pseudo.code.factory.impl;

import org.pseudo.code.facade.Room;
import org.pseudo.code.command.ReservationInfo;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;

public class ConcreteReservationFactoryWithoutParking implements ReservationFactory {
    public Reservation createReservation(ReservationInfo info) {
        Room room = new Room(info.getRoomType());

        return new Reservation(info.getGuest(), room, false, info.getStartDate(), info.getEndDate());
    }
}
