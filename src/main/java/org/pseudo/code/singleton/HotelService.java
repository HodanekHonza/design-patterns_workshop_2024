package org.pseudo.code.singleton;

import org.pseudo.code.factory.impl.*;
import org.pseudo.code.factory.Reservation;
import org.pseudo.code.factory.ReservationFactory;
import org.pseudo.code.command.ReservationInfo;

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

        String roomType = reservationInfo.getRoomType();
        boolean needsParking = reservationInfo.needsParking();

        switch (roomType.toLowerCase()) {
            case "basic":
                if (needsParking) {
                    factory = new ConcreteReservationFactoryBasicWithParking();
                } else {
                    factory = new ConcreteReservationFactoryBasicWithoutParking();
                }
                break;
            case "suite":
                if (needsParking) {
                    factory = new ConcreteReservationFactorySuiteWithParking();
                } else {
                    factory = new ConcreteReservationFactorySuiteWithoutParking();
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown room type: " + roomType);
        }

        Reservation reservation = factory.createReservation(reservationInfo);
        reservation.assignRoom();
    }
}
