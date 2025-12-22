// 6. Write a Java program to create a class called "Employee" with a name,
// job title, and salary attributes, and methods to calculate and update salary.

public class Employee {

        String name;
        String jobTitle;
        double salary;

        // Constructor
        Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        // Method to calculate annual salary
        double calculateAnnualSalary() {
            return salary * 12;
        }

        // Method to update salary by adding an increment
        void updateSalary(double increment) {
            salary = salary + increment;
        }

        // Method to display employee details
        void displayEmployee() {
            System.out.println("\nName: " + name);
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Salary: " + salary);
        }

}
