package org.pseudo.code;

import org.pseudo.code.command.impl.CommandImpl;
import org.pseudo.code.command.ReservationInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to Hotel Management System!");
        System.out.println("Enter a command ('reserve', 'exit') to proceed.");

        do {
            System.out.print("> ");
            userInput = scanner.nextLine().trim();

            switch (userInput.toLowerCase()) {
                case "reserve":
                    makeReservation();
                    break;
                case "exit":
                    System.out.println("Exiting Hotel Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'reserve' to make a reservation or 'exit' to quit.");
                    break;
            }

        } while (!userInput.equalsIgnoreCase("exit"));

        scanner.close();
    }

    private static void makeReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter guest name:");
        String guestName = scanner.nextLine();

        System.out.println("Do you need parking? (yes/no):");
        boolean needsParking = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Enter check-in date (yyyy-MM-dd):");
        String checkInDateStr = scanner.nextLine();
        System.out.println("Enter check-out date (yyyy-MM-dd):");
        String checkOutDateStr = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date checkInDate = dateFormat.parse(checkInDateStr);
            Date checkOutDate = dateFormat.parse(checkOutDateStr);





            // Create a ReservationInfo object with the provided details
            ReservationInfo reservationInfo = new ReservationInfo(guestName, needsParking, checkInDate, checkOutDate);
            // creating the reservation with command service, first sending the reservation info
            CommandImpl commandService = new CommandImpl(reservationInfo);
            // execute command which will call HotelService and use method makeReservation()
            commandService.execute();








            System.out.println("Reservation successfully made for " + guestName + "!");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use 'yyyy-MM-dd'.");
        }
    }
}
