// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.


public class Task1Person {
    // This class represents a Person with a name and age
    public static class Person {

        String name;  // attribute to store the person's name
        int age;      // attribute to store the person's age

        // Constructor to set name and age when creating an object
        public Person(String name, int age) {
            this.name = name;  // assign the given name to the object's name attribute
            this.age = age;    // assign the given age to the object's age attribute
        }

        // Method to print name and age
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {

            // Create first Person object using constructor
            Person person1 = new Person("John", 25);

            // Create second Person object using constructor
            Person person2 = new Person("Mary", 30);

            // Print their details
            person1.displayInfo();
            person2.displayInfo();
        }
    }

}
