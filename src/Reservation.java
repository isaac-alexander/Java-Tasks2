// 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.

// 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date.

import java.time.LocalDate;

public class Reservation {

    int reservationId;
    String customerName;
    LocalDate date;
    String status;

    // Constructor
    public Reservation(int reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
        this.status = "Confirmed";
    }

    // Check reservation status
    public String checkStatus() {
        return status;
    }

    // Modify reservation date
    public void changeDate(LocalDate newDate) {
        this.date = newDate;
    }

    // Display reservation details
    public void displayDetails() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
    }
}