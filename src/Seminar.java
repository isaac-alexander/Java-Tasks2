// Create subclass "Seminar" that add specific attributes like number of speakers for seminars

// Seminar subclass for Task 26
public class Seminar extends Event {

    int numberOfSpeakers;

    // Constructor
    public Seminar(String name, String date, String location, int numberOfSpeakers) {
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    // Display seminar details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}
