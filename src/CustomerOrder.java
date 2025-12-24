// 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.

// 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.

import java.time.LocalDate;

public class CustomerOrder {

    int orderId;
    String customer;
    LocalDate orderDate;

    // Constructor
    public CustomerOrder(int orderId, String customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    // Display order details
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}