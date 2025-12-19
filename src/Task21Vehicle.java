// 21. Write a Java program to create a class called "Vehicle" with attributes
// for make, model, and year. Create subclasses "Car" and "Truck" that add
// specific attributes like trunk size for cars and load limit for trucks.
// Implement a method to display vehicle details in each subclass.

public class Task21Vehicle {

    // Parent class
    static class Vehicle {
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

    // Car subclass
    static class Car extends Vehicle {
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

    // Truck subclass
    static class Truck extends Vehicle {
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

}
