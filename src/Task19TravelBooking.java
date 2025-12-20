// 19. Write a Java program to create a class with methods to search for flights
// and hotels, and to book and cancel reservations.

public class Task19TravelBooking {

    // Static inner class TravelService
    static class TravelService {

        String[] flights = new String[5]; // Store flight names
        String[] hotels = new String[5];  // Store hotel names

        boolean flightBooked = false;
        boolean hotelBooked = false;

        // Method to search for flights
        void searchFlight(String destination) {
            System.out.println("Searching flights to " + destination + "...");
            System.out.println("Flight found to " + destination);
        }

        // Method to search for hotels
        void searchHotel(String city) {
            System.out.println("Searching hotels in " + city + "...");
            System.out.println("Hotel found in " + city);
        }

        // Method to book a flight
        void bookFlight() {
            flightBooked = true;
            System.out.println("Flight booked successfully.");
        }

        // Method to cancel a flight
        void cancelFlight() {
            flightBooked = false;
            System.out.println("Flight booking canceled.");
        }

        // Method to book a hotel
        void bookHotel() {
            hotelBooked = true;
            System.out.println("Hotel booked successfully.");
        }

        // Method to cancel a hotel
        void cancelHotel() {
            hotelBooked = false;
            System.out.println("Hotel booking canceled.");
        }
    }

    public static void main(String[] args) {

        // Create TravelService object
        TravelService travelService = new TravelService();

        // Search for flights and hotels
        travelService.searchFlight("London");
        travelService.searchHotel("London");

        // Book reservations
        travelService.bookFlight();
        travelService.bookHotel();

        // Cancel reservations
        travelService.cancelFlight();
        travelService.cancelHotel();
    }
}
