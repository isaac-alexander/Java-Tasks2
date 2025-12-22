// 21. Write a Java program to create a class called "Vehicle" with attributes
// for make, model, and year. Create subclasses "Car" and "Truck" that add
// specific attributes like trunk size for cars and load limit for trucks.
// Implement a method to display vehicle details in each subclass.

// Parent class Vehicle

public class Vehicle {

    String make;
    String model;
    int year;

    // Constructor
    Vehicle(String mk, String mdl, int yr) {
        make = mk;
        model = mdl;
        year = yr;
    }

}
