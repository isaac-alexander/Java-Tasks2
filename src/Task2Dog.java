// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.


public class Task2Dog {
    // This program creates a Dog class with name and breed attributes.
// It creates two Dog objects using a constructor, updates their values
// using setter methods, and prints the updated values.

    public static class Dog {

        private String name;
        private String breed;

        // Constructor to set name and breed
        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        // Setter method to update the name
        public void setName(String name) {
            this.name = name;
        }

        // Setter method to update the breed
        public void setBreed(String breed) {
            this.breed = breed;
        }

        // Getter method to get the name
        public String getName() {
            return name;
        }

        // Getter method to get the breed
        public String getBreed() {
            return breed;
        }

        public static void main(String[] args) {

            // Creating two Dog objects using the constructor
            Dog dog1 = new Dog("Rocky", "German Shepherd");
            Dog dog2 = new Dog("Milo", "Bulldog");

            // Updating attributes using setter methods
            dog1.setName("Bruno");
            dog1.setBreed("Rottweiler");

            dog2.setName("Max");
            dog2.setBreed("Labrador");

            // Printing updated values
            System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
            System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
        }
    }

}
