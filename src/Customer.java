// 22. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.

import java.util.ArrayList;

public class Customer {

    String name;
    String email;

    // Purchase history using ArrayList
    ArrayList<Double> purchases = new ArrayList<>();

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Method to add a purchase
    public void addPurchase(double amount) {
        purchases.add(amount);
    }

    // Method to calculate total spending
    public double getTotalSpent() {
        double total = 0;

        for (int i = 0; i < purchases.size(); i++) {
            total += purchases.get(i);
        }

        return total;
    }
}
