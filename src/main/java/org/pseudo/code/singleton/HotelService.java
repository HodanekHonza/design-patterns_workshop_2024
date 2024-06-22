package org.pseudo.code.singleton;

import org.pseudo.code.factory.impl.ReservationFactoryWithParking;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;
import org.pseudo.code.command.ReservationInfo;

public class HotelService {
    private static HotelService instance;

    private HotelService() {}

    public static HotelService getInstance() {
        if (instance == null) {
            instance = new HotelService();
        }
        return instance;
    }

    public void makeReservation(ReservationInfo reservationInfo) {
        ReservationFactory factory = new ReservationFactoryWithParking();
        Reservation reservation = factory.createReservation(reservationInfo);
        reservation.assignRoom();
    }
}
