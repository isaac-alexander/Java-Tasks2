// 30. Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. Implement methods to calculate membership fees and check for special offers based on membership type.


public class GymMembership {

    String memberName;
    String membershipType; // Basic or Premium
    int duration; // number of months

    // Constructor
    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    // Calculate membership fee
    public double calculateFee() {
        double monthlyFee = 50; // basic monthly fee
        return monthlyFee * duration;
    }

    // Check if special offer applies
    public boolean hasSpecialOffer() {
        return duration >= 12;
    }

    // Display membership details
    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: $" + calculateFee());

        if (hasSpecialOffer()) {
            System.out.println("Special Offer: Yes");
        } else {
            System.out.println("Special Offer: No");
        }
    }
}