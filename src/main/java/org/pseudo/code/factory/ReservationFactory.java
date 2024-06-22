package org.pseudo.code.factory;

import org.pseudo.code.command.ReservationInfo;

public interface ReservationFactory {
    Reservation createReservation(ReservationInfo info);
}
