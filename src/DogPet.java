// DogPet subclass for Task 29 (renamed to avoid duplicate Dog class)

public class DogPet extends Pet {

    String favoriteToy;

    // Constructor
    public DogPet(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    // Calculate dog age in human years
    @Override
    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Age in Human Years: " + getHumanAge());
    }
}