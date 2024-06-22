package org.pseudo.code.singleton;

import org.pseudo.code.factory.impl.ConcreteReservationFactoryWithParking;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;
import org.pseudo.code.command.ReservationInfo;
import org.pseudo.code.factory.impl.ConcreteReservationFactoryWithoutParking;

public class HotelService {
    private static HotelService instance;

    private HotelService() {
    }

    public static HotelService getInstance() {
        if (instance == null) {
            instance = new HotelService();
        }
        return instance;
    }

    public void makeReservation(ReservationInfo reservationInfo) {
        ReservationFactory factory;
        if (reservationInfo.needsParking()) {
            factory = new ConcreteReservationFactoryWithParking();
        } else {
            factory = new ConcreteReservationFactoryWithoutParking();
        }
        Reservation reservation = factory.createReservation(reservationInfo);
        reservation.assignRoom();
    }
}
