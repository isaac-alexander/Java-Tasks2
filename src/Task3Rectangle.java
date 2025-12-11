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

        public static void main(String[] args) {
            // Create a Rectangle instance
            Rectangle r1 = new Rectangle(5, 10);

            System.out.println("Width: " + r1.width);
            System.out.println("Height: " + r1.height);

            System.out.println("Area: " + r1.getArea());
            System.out.println("Perimeter: " + r1.getPerimeter());
        }

}
