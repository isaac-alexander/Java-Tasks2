// 20. Write a Java program to create a class called "BankAccount" with attributes
// for account number, account holder's name, and balance.
// Include methods for depositing and withdrawing money, and checking the balance.
// Create a subclass called "SavingsAccount" that adds an interest rate attribute
// and a method to apply interest.

public class Task20BankAccount {

    // Main BankAccount class
    static class BankAccount {
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

    // SavingsAccount subclass
    static class SavingsAccount extends BankAccount {
        double interestRate;

        // Constructor
        SavingsAccount(int accNo, String name, double bal, double rate) {
            super(accNo, name, bal);
            interestRate = rate;
        }

        // Apply interest
        void applyInterest() {
            double interest = balance * interestRate / 100;
            balance = balance + interest;
            System.out.println("Interest added: " + interest);
        }
    }

    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount savingsAcc = new SavingsAccount(
                12345,
                "John Doe",
                1000.0,
                5.0
        );

        System.out.println("Account Holder: " + savingsAcc.accountHolderName);
        System.out.println("Account Number: " + savingsAcc.accountNumber);

        savingsAcc.checkBalance();
        savingsAcc.deposit(500);
        savingsAcc.withdraw(300);
        savingsAcc.applyInterest();
        savingsAcc.checkBalance();
    }
}
