// 18. Write a Java program to create a class called "Restaurant"
// with attributes for menu items, prices, and ratings,
// and methods to add and remove items, and to calculate average rating.

public class Task18Restaurant {

    // Static inner class Restaurant
    static class Restaurant {

        String[] menuItems = new String[10]; // Store food names
        double[] prices = new double[10];    // Store prices
        int[] ratings = new int[10];          // Store ratings

        int itemCount = 0; // Track number of items

        // Method to add a menu item
        void addItem(String itemName, double price, int rating) {
            menuItems[itemCount] = itemName;
            prices[itemCount] = price;
            ratings[itemCount] = rating;
            itemCount++;
            System.out.println("Item added: " + itemName);
        }

        // Method to remove a menu item by name
        void removeItem(String itemName) {
            for (int i = 0; i < itemCount; i++) {
                if (menuItems[i].equalsIgnoreCase(itemName)) {
                    menuItems[i] = menuItems[itemCount - 1];
                    prices[i] = prices[itemCount - 1];
                    ratings[i] = ratings[itemCount - 1];

                    menuItems[itemCount - 1] = null;
                    itemCount--;
                    System.out.println("Item removed: " + itemName);
                    break;
                }
            }
        }

        // Method to calculate average rating
        double getAverageRating() {
            int total = 0;
            for (int i = 0; i < itemCount; i++) {
                total = total + ratings[i];
            }
            return (double) total / itemCount;
        }

        // Method to show menu
        void showMenu() {
            System.out.println("Menu:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(
                        menuItems[i] + " - $" + prices[i] + " - Rating: " + ratings[i]
                );
            }
        }
    }

    public static void main(String[] args) {

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
    }
}
