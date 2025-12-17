// 16. Write a Java program to create a class called "Shape"
// with abstract methods for calculating area and perimeter,
// and subclasses for "Rectangle", "Circle", and "Triangle".

public class Task16Shape {

    // Abstract class Shape
    static abstract class Shape {

        // Abstract method to calculate area
        abstract double getArea();

        // Abstract method to calculate perimeter
        abstract double getPerimeter();
    }

    // Rectangle class
    static class Rectangle extends Shape {

        double width;
        double height;

        // Constructor
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Calculate area
        double getArea() {
            return width * height;
        }

        // Calculate perimeter
        double getPerimeter() {
            return 2 * (width + height);
        }
    }

    // Circle class
    static class Circle extends Shape {

        double radius;

        // Constructor
        Circle(double radius) {
            this.radius = radius;
        }

        // Calculate area
        double getArea() {
            return 3.14 * radius * radius;
        }

        // Calculate perimeter (circumference)
        double getPerimeter() {
            return 2 * 3.14 * radius;
        }
    }

    // Triangle class
    static class Triangle extends Shape {

        double side1;
        double side2;
        double side3;

        // Constructor
        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // Calculate area using simple formula (Heron's formula)
        double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        // Calculate perimeter
        double getPerimeter() {
            return side1 + side2 + side3;
        }
    }

}
