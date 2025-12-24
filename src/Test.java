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


        // TASK 11 LIBRARY
        // Create Library object
        Library schoolLibrary = new Library();

        // Create LibraryBook objects
        LibraryBook book1 = new LibraryBook("Java Basics", "John Doe");
        LibraryBook book2 = new LibraryBook("OOP Concepts", "Mary Smith");
        LibraryBook book3 = new LibraryBook("Data Structures", "Alan Walker");

        // Add books to the library
        schoolLibrary.addBook(book1);
        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);

        // Show all books
        schoolLibrary.showBooks();

        // Remove a book
        schoolLibrary.removeBook("OOP Concepts");

        // Show updated list
        schoolLibrary.showBooks();


        // TASK 12 AIRPLANE

        // Create an Airplane object
        Airplane flight1 = new Airplane("BA123", "London", "10:30 AM");

        // Display flight information
        flight1.displayFlightInfo();

        // Check flight status (on time)
        flight1.checkFlightStatus();

        // Delay the flight
        flight1.delayFlight();

        // Check flight status again
        flight1.checkFlightStatus();

        // TASK 13 INVENTORY
        // Create Inventory object
        Inventory storeInventory = new Inventory();

        // Add products
        storeInventory.addProduct(new InventoryProduct("Pen", 5));
        storeInventory.addProduct(new InventoryProduct("Book", 2));
        storeInventory.addProduct(new InventoryProduct("Notebook", 10));

        // Remove a product
        storeInventory.removeProduct("Pen");

        // Check for low stock (limit = 3)
        storeInventory.checkLowStock(3);

        // TASK 14 SCHOOL
        // Create School object
        School mySchool = new School();

        // Add students
        mySchool.addStudent(new SchoolStudent("Alex"));
        mySchool.addStudent(new SchoolStudent("Bella"));

        // Add teachers
        mySchool.addTeacher(new Teacher("Mr. John"));
        mySchool.addTeacher(new Teacher("Mrs. Smith"));

        // Create classes
        mySchool.createClass(new SchoolClass("Math"));
        mySchool.createClass(new SchoolClass("English"));

        // Remove one student and one teacher
        mySchool.removeStudent("Alex");
        mySchool.removeTeacher("Mr. John");

        // Display students
        System.out.println("Students:");
        for (int i = 0; i < mySchool.studentCount; i++) {
            System.out.println(mySchool.students[i].name);
        }

        // Display teachers
        System.out.println("Teachers:");
        for (int i = 0; i < mySchool.teacherCount; i++) {
            System.out.println(mySchool.teachers[i].name);
        }

        // Display classes
        System.out.println("Classes:");
        for (int i = 0; i < mySchool.classCount; i++) {
            System.out.println(mySchool.classes[i].className);
        }

        // TASK 15 MUSIC LIBRARY

        MusicLibrary myMusicLibrary = new MusicLibrary();

        // Add songs
        myMusicLibrary.addSong(new Song("Song One"));
        myMusicLibrary.addSong(new Song("Song Two"));
        myMusicLibrary.addSong(new Song("Song Three"));

        // Remove a song
        myMusicLibrary.removeSong("Song Two");

        // Play a random song
        myMusicLibrary.playRandomSong();

        // TASK 16 SHAPE

        // TASK 17 MOVIE
        // Create a Movie object for Rush Hour
        Movie movie1 = new Movie("Rush Hour", "Brett Ratner");

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

        // TASK 18 RESTAURANT

        // Create a Restaurant object
        Restaurant myRestaurant = new Restaurant();

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

        // TASK 19 TRAVEL BOOKING

        // Create TravelBooking object
        TravelBooking travelBooking = new TravelBooking();

        // Search for flights and hotels
        travelBooking.searchFlight("London");
        travelBooking.searchHotel("London");

        // Book reservations
        travelBooking.bookFlight();
        travelBooking.bookHotel();

        // Cancel reservations
        travelBooking.cancelFlight();
        travelBooking.cancelHotel();

        // TASK 20 BANK ACCOUNT
        // Create SavingsAccount object
        SavingsAccount savingsAcc = new SavingsAccount(
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

        // TASK 21 VEHICLE
        // Create Car object
        Car car1 = new Car("Toyota", "Corolla", 2020, 470);
        car1.showDetails();

        System.out.println();

        // Create Truck object
        Truck truck1 = new Truck("Ford", "F-150", 2019, 1200);
        truck1.showDetails();

        // TASK 22 CUSTOMER

        Customer customer1 = new Customer("Alex", "alex@mail.com");
        customer1.addPurchase(200);
        customer1.addPurchase(150);

        System.out.println("Customer Total Spent: " + customer1.getTotalSpent());

        LoyalCustomer customer2 = new LoyalCustomer("Isaac", "isaac@mail.com", 0.10);
        customer2.addPurchase(300);
        customer2.addPurchase(200);

        System.out.println("Loyal Customer Total Spent: " + customer2.getTotalSpent());
        System.out.println("After Discount: " + customer2.getDiscountedTotal());

        // TASK 23 COURSE

        // Normal course
        Course course = new Course("Through Ball Basics", "KDB", 2);
        course.displayDetails();

        System.out.println();

        // Online courses
        OnlineCourse onlineCourse1 = new OnlineCourse(
                "Double Touch and Rainbow Flick",
                "Neymar",
                4,
                "YouTube",
                15
        );

        OnlineCourse onlineCourse2 = new OnlineCourse(
                "Pass Feint",
                "Victor Boniface",
                3,
                "Twitch",
                7
        );

        // Display details
        onlineCourse1.displayDetails();
        System.out.println();

        onlineCourse2.displayDetails();
        System.out.println();

        // Certificate check for first course
        if (onlineCourse1.isEligibleForCertificate()) {
            System.out.println("Double Touch and Rainbow Flick is eligible for a certificate.");
        } else {
            System.out.println("Double Touch and Rainbow Flick is NOT eligible for a certificate.");
        }

        // Certificate check for second course
        if (onlineCourse2.isEligibleForCertificate()) {
            System.out.println("Pass Feint is eligible for a certificate.");
        } else {
            System.out.println("Pass Feint is NOT eligible for a certificate.");
        }


        // TASK 24 ELECTRONICS PRODUCT

        // Normal electronics product
        ElectronicsProduct phone = new ElectronicsProduct(101, "Smartphone", 800);
        phone.applyDiscount(10);
        phone.displayDetails();

        System.out.println();

        // Washing machine
        WashingMachine washer = new WashingMachine(202, "LG Washing Machine", 1200, 2);
        washer.applyDiscount(15);
        washer.extendWarranty(1);
        washer.displayDetails();

        // TASK 25 BUILDING
        // Residential building
        ResidentialBuilding residential = new ResidentialBuilding(
                "12 Adekoya Street",
                5,
                1200,
                10,
                15000
        );

        // Commercial building
        CommercialBuilding commercial = new CommercialBuilding(
                "45 Ilupeju Avenue",
                8,
                3000,
                2000,
                50
        );

        System.out.println("Residential Building:");
        residential.displayDetails();

        System.out.println();

        System.out.println("Commercial Building:");
        commercial.displayDetails();

        // TASK 26 EVENT
        // Create seminar
        Seminar seminar = new Seminar("Tech Seminar", "2025-10-10", "Hall A", 3);

        // Create musical performance
        MusicalPerformance concert = new MusicalPerformance("Live Concert", "2025-10-10", "Hall A");

        concert.addPerformer("Dave");
        concert.addPerformer("Giggs");

        // Display details
        seminar.displayDetails();
        System.out.println();
        concert.displayDetails();

        System.out.println();

        // Check for schedule conflict
        if (seminar.hasConflict(concert)) {
            System.out.println("Conflict detected: Events overlap in schedule.");
        } else {
            System.out.println("No conflict: Events are scheduled safely.");
        }

        // TASK 27 CUSTOMER ORDER
        OnlineOrder order = new OnlineOrder(
                1001,
                "Alexander Isaac",
                LocalDate.now(),
                "Lagos",
                "TRK123456"
        );

        order.displayDetails();

        System.out.println();

        // Update tracking status
        order.updateTrackingStatus("Out for Delivery");

        System.out.println("After status update:");
        order.displayDetails();

        // TASK 28 RESERVATION

        ResortReservation resortReservation = new ResortReservation(
                201,
                "Alex",
                LocalDate.of(2025, 6, 10),
                619
        );

        RailwayReservation railwayReservation = new RailwayReservation(
                202,
                "Bella",
                LocalDate.of(2025, 6, 12),
                "M4"
        );

        resortReservation.displayDetails();
        System.out.println();

        railwayReservation.displayDetails();
        System.out.println();

        // Modify reservations
        resortReservation.changeRoom(911);
        railwayReservation.changeSeat("M13");

        System.out.println("After changes:");
        resortReservation.displayDetails();
        System.out.println();
        railwayReservation.displayDetails();

        // TASK 29 PET

        DogPet dog = new DogPet(
                "Kiba",
                4,
                "Ball"
        );

        Bird bird = new Bird(
                "Sky",
                2,
                1.2
        );

        dog.displayDetails();
        System.out.println();

        bird.displayDetails();

        // TASK 30 GYM MEMBERSHIP
        GymMembership basicMember = new GymMembership(
                "Alex",
                "Basic",
                6
        );

        PremiumMembership premiumMember = new PremiumMembership(
                "Sarah",
                12,
                true,
                true
        );

        basicMember.displayDetails();
        System.out.println();

        premiumMember.displayDetails();

    }
}
