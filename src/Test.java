import java.time.LocalDate;

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

        // TASK 7

        Task7Bank.Bank bank = new Task7Bank.Bank();

        // Create account objects
        Task7Bank.Account acc1 = new Task7Bank.Account(101, "John", 5000);
        Task7Bank.Account acc2 = new Task7Bank.Account(102, "Mary", 8000);

        // Add accounts to bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.showAccounts();

        // Deposit and withdraw
        bank.depositToAccount(101, 2000);
        bank.withdrawFromAccount(102, 3000);

        bank.showAccounts();

        // Remove an account
        bank.removeAccount(101);

        bank.showAccounts();

        // TASK 8

        // Create a TrafficLight object
        Task8TrafficLight.TrafficLight light = new Task8TrafficLight.TrafficLight("red", 60);

        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        // Change color
        light.changeColor("green");
        System.out.println("\nAfter changing color:");

        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        // TASK 9

        // First employee object
        Task9Employee.Employee employee1 = new Task9Employee.Employee(
                "David",
                60000,
                LocalDate.of(2018, 5, 10)
        );

        // Second employee object
        Task9Employee.Employee employee2 = new Task9Employee.Employee(
                "Sarah",
                55000,
                LocalDate.of(2020, 3, 15)
        );

        // Display details
        employee1.displayEmployee();
        System.out.println();
        employee2.displayEmployee();


        // TASK 10

        // Create a Student object
        Task10Student.Student student1 = new Task10Student.Student("Alex", "A");

        // Add courses
        student1.addCourse("Mathematics");
        student1.addCourse("Physics");
        student1.addCourse("Computer Science");

        // Display student details
        student1.displayStudent();

        // Remove a course
        student1.removeCourse("Physics");

        // Display updated details
        System.out.println("\nAfter removing a course:");
        student1.displayStudent();

        // TASK 11
        Task11Library.Library schoolLibrary = new Task11Library.Library();

        // Create book objects
        Task11Library.Book book1 = new Task11Library.Book("Java Basics", "John Doe");
        Task11Library.Book book2 = new Task11Library.Book("OOP Concepts", "Mary Smith");
        Task11Library.Book book3 = new Task11Library.Book("Data Structures", "Alan Walker");

        // Add books to the library
        schoolLibrary.addBook(book1);
        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);

        schoolLibrary.showBooks();

        // Remove a book
        schoolLibrary.removeBook("OOP Concepts");

        // Display updated list
        schoolLibrary.showBooks();

        // TASK 12

        // Create an Airplane object
        Task12Airplane.Airplane flight1 = new Task12Airplane.Airplane("BA123", "London", "10:30 AM");

        // Display flight information
        flight1.displayFlightInfo();

        // Check flight status (on time)
        flight1.checkFlightStatus();

        // Delay the flight
        flight1.delayFlight();

        // Check flight status again
        flight1.checkFlightStatus();

        // TASK 13

        // Create an Inventory object
        Task13Inventory.Inventory storeInventory = new Task13Inventory.Inventory();

        // Add products
        storeInventory.addProduct(new Task13Inventory.Product("Pen", 5));
        storeInventory.addProduct(new Task13Inventory.Product("Book", 2));
        storeInventory.addProduct(new Task13Inventory.Product("Notebook", 10));

        // Remove a product
        storeInventory.removeProduct("Pen");

        // Check for low inventory using limit
        storeInventory.checkLowInventory(3);

        // TASK 14

        // Create a School object
        Task14School.School mySchool = new Task14School.School();

        // Add students
        mySchool.addStudent(new Task14School.Student("Alex"));
        mySchool.addStudent(new Task14School.Student("Bella"));

        // Add teachers
        mySchool.addTeacher(new Task14School.Teacher("Mr. John"));
        mySchool.addTeacher(new Task14School.Teacher("Mrs. Smith"));

        // Create classes
        mySchool.createClass(new Task14School.ClassRoom("Math"));
        mySchool.createClass(new Task14School.ClassRoom("English"));

        // Remove a student and a teacher
        mySchool.removeStudent("Alex");
        mySchool.removeTeacher("Mr. John");

        // Display remaining students
        System.out.println("Students:");
        for (int i = 0; i < mySchool.studentCount; i++) {
            System.out.println(mySchool.students[i].name);
        }

        // Display remaining teachers
        System.out.println("Teachers:");
        for (int i = 0; i < mySchool.teacherCount; i++) {
            System.out.println(mySchool.teachers[i].name);
        }

        // Display classes
        System.out.println("Classes:");
        for (int i = 0; i < mySchool.classCount; i++) {
            System.out.println(mySchool.classes[i].className);
        }

        // TASK 15

        // Create a MusicLibrary object
        Task15MusicLibrary.MusicLibrary myMusicLibrary = new Task15MusicLibrary.MusicLibrary();

        // Add songs
        myMusicLibrary.addSong(new Task15MusicLibrary.Song("Song One"));
        myMusicLibrary.addSong(new Task15MusicLibrary.Song("Song Two"));
        myMusicLibrary.addSong(new Task15MusicLibrary.Song("Song Three"));

        // Remove a song
        myMusicLibrary.removeSong("Song Two");

        // Play a random song
        myMusicLibrary.playRandomSong();

        // TASK 16

        // Create Rectangle object
        Task16Shape.Shape rectangle = new Task16Shape.Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Create Circle object
        Task16Shape.Shape circle = new Task16Shape.Circle(7);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        // Create Triangle object
        Task16Shape.Shape triangle = new Task16Shape.Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        // TASK 17

        // Create a Movie object for Rush Hour
        Task17Movie.Movie movie1 = new Task17Movie.Movie("Rush Hour", "Brett Ratner");

        // Add actors
        movie1.addActor("Jackie Chan");
        movie1.addActor("Chris Tucker");

        // Add reviews
        movie1.addReview("Very funny and entertaining.");
        movie1.addReview("Great action and comedy.");

        // Display movie details
        movie1.showMovieDetails();

        // Display reviews
        movie1.showReviews();

        // TASK 18

        // Create a Restaurant object
        Task18Restaurant.Restaurant myRestaurant = new Task18Restaurant.Restaurant();

        // Add menu items (as requested)
        myRestaurant.addItem("Burger", 5.99, 4);
        myRestaurant.addItem("Pizza", 8.49, 5);
        myRestaurant.addItem("Meat Pie", 4.25, 4);

        // Show menu
        myRestaurant.showMenu();

        // Remove an item
        myRestaurant.removeItem("Meat Pie");

        // Show updated menu
        myRestaurant.showMenu();

        // Show average rating
        System.out.println("Average Rating: " + myRestaurant.getAverageRating());

        // TASK 19

        // Create TravelService object
        Task19TravelBooking.TravelService travelService = new Task19TravelBooking.TravelService();

        // Search for flights and hotels
        travelService.searchFlight("London");
        travelService.searchHotel("London");

        // Book reservations
        travelService.bookFlight();
        travelService.bookHotel();

        // Cancel reservations
        travelService.cancelFlight();
        travelService.cancelHotel();

        // TASK 20

        // Create SavingsAccount object
        Task20BankAccount.SavingsAccount savingsAcc = new Task20BankAccount.SavingsAccount(
                12345,
                "John Doe",
                1000.0,
                5.0
        );

        System.out.println("Account Holder: " + savingsAcc.accountHolderName);
        System.out.println("Account Number: " + savingsAcc.accountNumber);

        savingsAcc.checkBalance();
        savingsAcc.deposit(500);
        savingsAcc.withdraw(300);
        savingsAcc.applyInterest();
        savingsAcc.checkBalance();

        // TASK 21

        // Create Car object
        Task21Vehicle.Car car1 = new Task21Vehicle.Car("Toyota", "Corolla", 2020, 470);
        car1.showDetails();

        System.out.println();

        // Create Truck object
        Task21Vehicle.Truck truck1 = new Task21Vehicle.Truck("Ford", "F-150", 2019, 1200);
        truck1.showDetails();

    }
}
