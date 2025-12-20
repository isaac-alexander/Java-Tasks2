// 7. Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.


// Define a class called "Account" to maintain account details of a particular customer.

public class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to set account details
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
