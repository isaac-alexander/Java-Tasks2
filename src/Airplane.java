// 12. Write a Java program to create a class called "Airplane" with a flight number,
// destination, and departure time attributes, and methods to check flight status and delay.

public class Airplane {
     String flightNumber;
        String destination;
        String departureTime;
        boolean delayed;

        // Constructor
        Airplane(String flightNumber, String destination, String departureTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
            this.delayed = false; // flight is on time by default
        }

        // Method to delay the flight
        void delayFlight() {
            delayed = true;
        }

        // Method to check flight status
        void checkFlightStatus() {
            if (delayed) {
                System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
            } else {
                System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
            }
        }

        // Method to display flight details
        void displayFlightInfo() {
            System.out.println("Flight Number: " + flightNumber);
            System.out.println("Destination: " + destination);
            System.out.println("Departure Time: " + departureTime);
        }
}
