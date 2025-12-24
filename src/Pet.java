// 29. Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details and calculate the pet's age in human years.

// 29. Write a Java program to create a class called "Pet"
// with attributes for name, species, and age.

public class Pet {

    String name;
    String species;
    int age;

    // Constructor
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Display pet details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }

    // Calculate age in human years (default)
    public int getHumanAge() {
        return age;
    }
}