// Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration

// Subclass OnlineCourse that extends Course
public class OnlineCourse extends Course {

    String platform;
    int duration; // duration in hours

    // Constructor
    public OnlineCourse(String courseName, String instructor, int credits,
                        String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Display online course details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }

    // Check if eligible for certificate
    public boolean isEligibleForCertificate() {
        return duration >= 10;
    }
}
