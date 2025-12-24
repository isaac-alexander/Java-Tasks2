// Bird subclass for Task 29

public class Bird extends Pet {

    double wingSpan; // in meters

    // Constructor
    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    // Calculate bird age in human years (simple logic)
    @Override
    public int getHumanAge() {
        return age * 5;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan + " meters");
        System.out.println("Age in Human Years: " + getHumanAge());
    }
}