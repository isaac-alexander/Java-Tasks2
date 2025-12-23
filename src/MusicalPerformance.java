//Create subclass "MusicalPerformance" that add specific attributes like performer list for concerts

// MusicalPerformance subclass for Task 26

import java.util.ArrayList;

public class MusicalPerformance extends Event {

    ArrayList<String> performers = new ArrayList<>();

    // Constructor
    public MusicalPerformance(String name, String date, String location) {
        super(name, date, location);
    }

    // Add a performer
    public void addPerformer(String performer) {
        performers.add(performer);
    }

    // Display musical performance details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers:");
        for (String performer : performers) {
            System.out.println("- " + performer);
        }
    }
}
