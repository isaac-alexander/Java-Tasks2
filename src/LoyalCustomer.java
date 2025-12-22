// Task 22: Loyal customer with discount

public class LoyalCustomer extends Customer {

    double discountRate; // example: 0.10 means 10% discount

    // Constructor
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Apply discount to total spending
    public double getDiscountedTotal() {
        double total = getTotalSpent();
        return total - (total * discountRate);
    }
}
