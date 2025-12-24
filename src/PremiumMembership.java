// Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. Implement methods to calculate membership fees and check for special offers based on membership type.

// PremiumMembership subclass for Task 30

public class PremiumMembership extends GymMembership {

    boolean personalTrainer;
    boolean spaAccess;

    // Constructor
    public PremiumMembership(
            String memberName,
            int duration,
            boolean personalTrainer,
            boolean spaAccess
    ) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    // Calculate premium membership fee
    @Override
    public double calculateFee() {
        double monthlyFee = 80;

        if (personalTrainer) {
            monthlyFee += 30;
        }

        if (spaAccess) {
            monthlyFee += 20;
        }

        return monthlyFee * duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + personalTrainer);
        System.out.println("Spa Access: " + spaAccess);
    }
}