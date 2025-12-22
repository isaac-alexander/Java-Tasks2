// 21. Write a Java program to create a class called "Vehicle" with attributes
// for make, model, and year. Create subclasses "Car" and "Truck" that add
// specific attributes like trunk size for cars and load limit for trucks.
// Implement a method to display vehicle details in each subclass.

// Truck subclass
public class Truck extends Vehicle {
    double loadLimit;

    // Constructor
    Truck(String mk, String mdl, int yr, double load) {
        super(mk, mdl, yr);
        loadLimit = load;
    }

    // Display truck details
    void showDetails() {
        System.out.println("Truck Make: " + make);
        System.out.println("Truck Model: " + model);
        System.out.println("Truck Year: " + year);
        System.out.println("Load Limit: " + loadLimit + " kg");
    }
}