package org.pseudo.code.command;

import org.pseudo.code.singleton.HotelService;
public class CommandImpl implements Command {
    private final ReservationInfo reservationInfo;

    public CommandImpl(ReservationInfo reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    @Override
    public void execute() {
        HotelService.getInstance().makeReservation(reservationInfo);
    }
}
