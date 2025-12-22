// 20. Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance.
// Include methods for depositing and withdrawing money, and checking the balance.
// Create a subclass called "SavingsAccount" that adds an interest rate attribute
// and a method to apply interest.

// Main BankAccount class
public class BankAccount {

        int accountNumber;
        String accountHolderName;
        double balance;

        // Constructor
        BankAccount(int accNo, String name, double bal) {
            accountNumber = accNo;
            accountHolderName = name;
            balance = bal;
        }

        // Deposit money
        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }

        // Withdraw money
        void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Not enough balance");
            }
        }

        // Check balance
        void checkBalance() {
            System.out.println("Current balance: " + balance);
        }
}
