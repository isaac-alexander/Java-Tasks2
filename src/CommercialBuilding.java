// CommercialBuilding subclass for Task 25

public class CommercialBuilding extends Building {

    double officeSpace;       // in square meters
    double rentPerSquareMeter;

    // Constructor
    public CommercialBuilding(
            String address,
            int numberOfFloors,
            double totalArea,
            double officeSpace,
            double rentPerSquareMeter
    ) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    // Calculate total rent
    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }

    // Display commercial building details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sqm");
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

