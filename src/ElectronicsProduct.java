// 24. Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.


// Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price.
// Implement methods to apply a discount and calculate the final price.

public class ElectronicsProduct {

    int productId;
    String name;
    double price;
    double discount;

    // Constructor
    public ElectronicsProduct(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discount = 0;
    }

    // Apply discount percentage
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    // Calculate final price after discount
    public double getFinalPrice() {
        return price - (price * discount / 100);
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getFinalPrice());
    }
}
