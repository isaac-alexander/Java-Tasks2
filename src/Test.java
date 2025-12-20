import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // TASK1 PERSON

        // Create first Person object using constructor
        Person person1 = new Person("John", 25);

        // Create second Person object using constructor
        Person person2 = new Person("Mary", 30);

        // Print their details
        person1.displayInfo();
        person2.displayInfo();

        // TASK 2 DOG

        // Creating two Dog objects using the constructor
        Dog dog1 = new Dog("Rocky", "German Shepherd");
        Dog dog2 = new Dog("Milo", "Bulldog");

        // Updating attributes using setter methods
        dog1.setName("Bruno");
        dog1.setBreed("Rottweiler");

        dog2.setName("Max");
        dog2.setBreed("Labrador");

        // Printing updated values
        System.out.println("\nDog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // TASK 3 RECTANGLE
        // Create a Rectangle instance
        Rectangle r1 = new Rectangle(5, 10);

        System.out.println("\nWidth: " + r1.width);
        System.out.println("Height: " + r1.height);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // TASK 4 CIRCLE
        // Create a Circle instance
        Circle c1 = new Circle(7);

        System.out.println("\nInitial Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        // Modify radius
        c1.setRadius(10);
        System.out.println("\nUpdated Radius: " + c1.getRadius());
        System.out.println("Updated Area: " + c1.getArea());
        System.out.println("Updated Circumference: " + c1.getCircumference());

        // TASK 5 BOOK

        Book.BookCollection library = new Book.BookCollection();

        // Create book objects
        Book b1 = new Book("Java Basics", "John Doe", "1111");
        Book b2 = new Book("OOP Concepts", "Mary Smith", "2222");
        Book b3 = new Book("Data Structures", "Alan Walker", "3333");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.showBooks();

        // Remove one book
        library.removeBook("2222");

        // Show updated list
        library.showBooks();

        // TASK 6 EMPLOYEE

        // Create an Employee object
        Employee emp1 = new Employee("Alice", "Software Engineer", 50000);

        // Display original details
        emp1.displayEmployee();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());

        // Update salary
        emp1.updateSalary(5000);

        // Display updated details
        System.out.println("\nAfter Salary Update:");
        emp1.displayEmployee();
        System.out.println("Updated Annual Salary: " + emp1.calculateAnnualSalary());

        // TASK 7 BANK
        // Main class to test the Bank and Account classes.

        Bank bank = new Bank();

        // Create account objects
        Account acc1 = new Account(101, "John", 5000);
        Account acc2 = new Account(102, "Mary", 8000);

        // Add accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.showAccounts();

        // Deposit and withdraw money
        bank.depositToAccount(101, 2000);
        bank.withdrawFromAccount(102, 3000);

        bank.showAccounts();

        // Remove an account
        bank.removeAccount(101);

        bank.showAccounts();

        // TASK 8 TRAFFIC LIGHT

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

        // TASK 9 STAFF

        // Create first staff object
        Staff staff1 = new Staff("David", 60000, LocalDate.of(2018, 5, 10));

        // Create second staff object
        Staff staff2 = new Staff("Sarah", 55000, LocalDate.of(2020, 3, 15));

        // Display staff details
        staff1.displayDetails();
        System.out.println();
        staff2.displayDetails();


        // TASK 10 STUDENT
        // Create a student object
        Student student1 = new Student("Alex", "A");

        // Add courses
        student1.addCourse("Mathematics");
        student1.addCourse("Physics");
        student1.addCourse("Computer Science");

        // Show student details
        student1.displayStudent();

        // Remove a course
        student1.removeCourse("Physics");

        // Show updated details
        System.out.println("\nAfter removing a course:");
        student1.displayStudent();


        // TASK 11

        // TASK 12

        // TASK 13

        // TASK 14

        // TASK 15

        // TASK 16

        // TASK 17

        // TASK 18

        // TASK 19

        // TASK 20

        // TASK 21

    }
}
