// 8. Write a Java program to create a class called "TrafficLight" with attributes
// for color and duration, and methods to change the color and check for red or green.

public class Task8TrafficLight {

    static class TrafficLight {
        String color;
        int duration; // duration in seconds

        // Constructor
        TrafficLight(String color, int duration) {
            this.color = color;
            this.duration = duration;
        }

        // Method to change the traffic light color
        void changeColor(String newColor) {
            color = newColor;
        }

        // Method to check if the light is red
        boolean isRed() {
            return color.equalsIgnoreCase("red");
        }

        // Method to check if the light is green
        boolean isGreen() {
            return color.equalsIgnoreCase("green");
        }

        // Method to display traffic light status
        void displayStatus() {
            System.out.println("Color: " + color);
            System.out.println("Duration: " + duration + " seconds");
        }
    }

    public static void main(String[] args) {

        // Create a TrafficLight object
        TrafficLight light = new TrafficLight("red", 60);

        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        // Change color
        light.changeColor("green");
        System.out.println("\nAfter changing color:");

        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());
    }
}
