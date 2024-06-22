package org.pseudo.code.command;

import org.pseudo.code.singleton.HotelService;

public class CommandService {
    private final ReservationInfo reservationInfo;

    public CommandService(ReservationInfo reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    public void execute() {
        HotelService.getInstance().makeReservation(reservationInfo);
    }
}
