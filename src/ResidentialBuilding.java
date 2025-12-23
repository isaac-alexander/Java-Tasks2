//  Create subclasses "ResidentialBuilding" that add specific attributes like number of apartments for residential

// ResidentialBuilding subclass for Task 25

public class ResidentialBuilding extends Building {

    int numberOfApartments;
    double rentPerApartment;

    // Constructor
    public ResidentialBuilding(
            String address,
            int numberOfFloors,
            double totalArea,
            int numberOfApartments,
            double rentPerApartment
    ) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    // Calculate total rent
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    // Display residential building details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Apartments: " + numberOfApartments);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

