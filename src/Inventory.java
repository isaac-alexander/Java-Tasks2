// 13. Write a Java program to create a class called "Inventory"
// with a collection of products and methods to add and remove products,
// and to check for low inventory

// Task 13:
// This class manages products and checks for low stock.

public class Inventory {

    InventoryProduct[] products = new InventoryProduct[10]; // stores products
    int count = 0;                                           // number of products

    // Method to add a product
    void addProduct(InventoryProduct product) {
        if (count < products.length) {
            products[count] = product;
            count++;
            System.out.println("Product added: " + product.name);
        }
    }

    // Method to remove a product using the name
    void removeProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].name.equalsIgnoreCase(name)) {
                System.out.println("Removing product: " + products[i].name);

                // Replace removed product with the last one
                products[i] = products[count - 1];
                products[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    // Method to check products with low quantity
    void checkLowStock(int limit) {
        for (int i = 0; i < count; i++) {
            if (products[i].quantity <= limit) {
                System.out.println(
                        products[i].name + " is low in stock. Quantity: " + products[i].quantity
                );
            }
        }
    }
}
