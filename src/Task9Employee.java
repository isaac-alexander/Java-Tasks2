// 9. Write a Java program to create a class called "Employee" with a name,
// salary, and hire date attributes, and a method to calculate years of service.

import java.time.LocalDate;

public class Task9Employee {

    static class Employee {
        String name;
        double salary;
        LocalDate hireDate;

        // Constructor
        Employee(String name, double salary, LocalDate hireDate) {
            this.name = name;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        // Method to calculate years of service
        int calculateYearsOfService() {
            LocalDate currentDate = LocalDate.now();
            return currentDate.getYear() - hireDate.getYear();
        }

        // Method to display employee details
        void displayEmployee() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Hire Date: " + hireDate);
            System.out.println("Years of Service: " + calculateYearsOfService());
        }
    }

}
