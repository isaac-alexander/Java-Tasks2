// 13. Write a Java program to create a class called "Inventory"
// with a collection of products and methods to add and remove products,
// and to check for low inventory

public class Task13Inventory {

    // Static inner class Product
    static class Product {
        String name;
        int quantity;

        // Constructor to set product name and quantity
        Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }

    // Static inner class Inventory
    static class Inventory {

        Product[] products = new Product[10]; // Array to store products
        int count = 0; // Keeps track of how many products are added

        // Method to add a product to the inventory
        void addProduct(Product product) {
            products[count] = product;
            count++;
        }

        // Method to remove a product by name
        void removeProduct(String name) {
            for (int i = 0; i < count; i++) {
                if (products[i].name.equalsIgnoreCase(name)) {
                    products[i] = products[count - 1]; // Replace with last product
                    products[count - 1] = null; // Clear last spot
                    count--;
                    break;
                }
            }
        }

        // Method to check for low inventory
        void checkLowInventory(int limit) {
            for (int i = 0; i < count; i++) {
                if (products[i].quantity <= limit) {
                    System.out.println(
                            products[i].name + " is low in stock. Quantity: " + products[i].quantity
                    );
                }
            }
        }
    }

}
