// 7. Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.

// Create a class called "Bank" with a collection of accounts and methods
// to add and remove accounts, and to deposit and withdraw money.
public class Bank {

    Account[] accounts = new Account[10]; // fixed-size
    int count = 0; // keeps track of number of accounts

    // Method to add an account
    void addAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            System.out.println("Account added for " + account.accountHolderName);
        } else {
            System.out.println("Bank account limit reached.");
        }
    }

    // Method to remove an account using account number
    void removeAccount(int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                System.out.println("Removing account: " + accounts[i].accountHolderName);

                // Shift accounts to the left
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }

                accounts[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to deposit money into an account
    void depositToAccount(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].deposit(amount);
                System.out.println("Deposited " + amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to withdraw money from an account
    void withdrawFromAccount(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to display all accounts
    void showAccounts() {
        System.out.println("\nBank Accounts:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    "Account No: " + accounts[i].accountNumber +
                            ", Name: " + accounts[i].accountHolderName +
                            ", Balance: " + accounts[i].balance
            );
        }
    }
}
