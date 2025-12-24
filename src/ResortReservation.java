// ResortReservation subclass for Task 28

import java.time.LocalDate;

public class ResortReservation extends Reservation {

    int roomNumber;

    // Constructor
    public ResortReservation(
            int reservationId,
            String customerName,
            LocalDate date,
            int roomNumber
    ) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    // Change room number
    public void changeRoom(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}