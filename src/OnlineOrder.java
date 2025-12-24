// OnlineOrder subclass for Task 27

public class OnlineOrder extends CustomerOrder {

    String deliveryAddress;
    String trackingNumber;
    String trackingStatus;

    // Constructor
    public OnlineOrder(
            int orderId,
            String customer,
            java.time.LocalDate orderDate,
            String deliveryAddress,
            String trackingNumber
    ) {
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Order Placed";
    }

    // Calculate delivery time based on address
    public int calculateDeliveryTime() {
        if (deliveryAddress.equalsIgnoreCase("lagos")) {
            return 2; // days
        } else {
            return 5; // days
        }
    }

    // Update tracking status
    public void updateTrackingStatus(String newStatus) {
        trackingStatus = newStatus;
    }

    // Display online order details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}