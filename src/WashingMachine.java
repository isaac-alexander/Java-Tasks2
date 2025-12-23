// 24.  Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.

// Subclass of ElectronicsProduct for Task 24
public class WashingMachine extends ElectronicsProduct {

    int warrantyPeriod; // in years

    // Constructor
    public WashingMachine(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Extend warranty
    public void extendWarranty(int extraYears) {
        warrantyPeriod += extraYears;
    }

    // Display washing machine details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}
