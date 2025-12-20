// 9. Write a Java program to create a class called "Staff" with a name,
// salary, and hire date attributes, and a method to calculate years of service.


import java.time.LocalDate;

public class Staff {

    String name;
    double salary;
    LocalDate hireDate;

    // Constructor to set staff details
    public Staff(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate how many years the staff has worked
    int getYearsOfService() {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Subtract hire year from current year
        return today.getYear() - hireDate.getYear();
    }

    // Method to display staff details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
    }

}
