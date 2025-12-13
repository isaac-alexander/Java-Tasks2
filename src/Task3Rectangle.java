// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 2 methods to calculate the area and perimeter of the rectangle.



public class Task3Rectangle {
    static class Rectangle {
        double width;
        double height;

        // Constructor
        Rectangle(double w, double h) {
            width = w;
            height = h;
        }

        // Method to calculate area
        double getArea() {
            return width * height;
        }

        // Method to calculate perimeter
        double getPerimeter() {
            return 2 * (width + height);
        }
    }


}
