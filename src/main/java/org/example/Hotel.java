package org.example;

public class Hotel {
    private static Hotel instance;

    private Hotel() {} // private constructor to prevent instantiation

    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public void makeReservation(ReservationInfo reservationInfo) {
        ReservationFactory factory = new ConcreteReservationFactory();
        Reservation reservation = factory.createReservation(reservationInfo);
        reservation.assignRoom();
    }
}
