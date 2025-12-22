// 21. Write a Java program to create a class called "Vehicle" with attributes
// for make, model, and year. Create subclasses "Car" and "Truck" that add
// specific attributes like trunk size for cars and load limit for trucks.
// Implement a method to display vehicle details in each subclass.


// Car subclass
public class Car extends Vehicle {
    double trunkSize;

    // Constructor
    Car(String mk, String mdl, int yr, double trunk) {
        super(mk, mdl, yr);
        trunkSize = trunk;
    }

    // Display car details
    void showDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Trunk Size: " + trunkSize + " liters");
    }
}