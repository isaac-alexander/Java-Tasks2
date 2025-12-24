// RailwayReservation subclass for Task 28

import java.time.LocalDate;

public class RailwayReservation extends Reservation {

    String seatNumber;

    // Constructor
    public RailwayReservation(
            int reservationId,
            String customerName,
            LocalDate date,
            String seatNumber
    ) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    // Change seat number
    public void changeSeat(String newSeatNumber) {
        this.seatNumber = newSeatNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}