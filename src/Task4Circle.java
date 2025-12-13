// 4. Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.

public class Task4Circle {
    static class Circle {
        double radius;

        // Constructor
        Circle(double r) {
            radius = r;
        }

        // Setter method to modify radius
        void setRadius(double r) {
            radius = r;
        }

        // Getter method to access radius
        double getRadius() {
            return radius;
        }

        // Method to calculate area
        double getArea() {
            return Math.PI * radius * radius;
        }

        // Method to calculate circumference
        double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }

}
