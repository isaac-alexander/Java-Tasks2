public class Test {
    public static void main(String[] args) {
        // TASK1
        // Create first Person object using constructor
        Task1Person.Person person1 = new Task1Person.Person("John", 25);

        // Create second Person object using constructor
        Task1Person.Person person2 = new Task1Person.Person("Mary", 30);

        // Print their details
        person1.displayInfo();
        person2.displayInfo();

        // TASK 2
        // Creating two Dog objects using the constructor
        Task2Dog.Dog dog1 = new Task2Dog.Dog("Rocky", "German Shepherd");
        Task2Dog.Dog dog2 = new Task2Dog.Dog("Milo", "Bulldog");

        // Updating attributes using setter methods
        dog1.setName("Bruno");
        dog1.setBreed("Rottweiler");

        dog2.setName("Max");
        dog2.setBreed("Labrador");

        // Printing updated values
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // TASK 3
        // Create a Rectangle instance
        Task3Rectangle.Rectangle r1 = new Task3Rectangle.Rectangle(5, 10);

        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // TASK 4
        // Create a Circle instance
        Task4Circle.Circle c1 = new Task4Circle.Circle(7);

        System.out.println("Initial Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        // Modify radius
        c1.setRadius(10);
        System.out.println("\nUpdated Radius: " + c1.getRadius());
        System.out.println("Updated Area: " + c1.getArea());
        System.out.println("Updated Circumference: " + c1.getCircumference());


        // TASK 5
        Task5Book.BookCollection library = new Task5Book.BookCollection();

        // Create book objects
        Task5Book.Book b1 = new Task5Book.Book("Java Basics", "John Doe", "1111");
        Task5Book.Book b2 = new Task5Book.Book("OOP Concepts", "Mary Smith", "2222");
        Task5Book.Book b3 = new Task5Book.Book("Data Structures", "Alan Walker", "3333");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.showBooks();

        // Remove one book
        library.removeBook("2222");

        // Show updated list
        library.showBooks();

        // TASK 6
        // Create an Employee object
        Task6Employee.Employee emp1 = new Task6Employee.Employee("Alice", "Software Engineer", 50000);

        // Display original details
        emp1.displayEmployee();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());

        // Update salary
        emp1.updateSalary(5000);

        // Display updated details
        System.out.println("\nAfter Salary Update:");
        emp1.displayEmployee();
        System.out.println("Updated Annual Salary: " + emp1.calculateAnnualSalary());

    }
}
