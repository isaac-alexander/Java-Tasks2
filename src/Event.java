// 26. Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.


// Write a Java program to create a class called "Event" with attributes for event name, date, and location.
// Implement methods to display event details and check for conflicts.

public class Event {

    String name;
    String date;     // kept as String for simplicity
    String location;

    // Constructor
    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    // Display event details
    public void displayDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    // Check if two events conflict (same date and location)
    public boolean hasConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date)
                && this.location.equalsIgnoreCase(otherEvent.location);
    }
}
