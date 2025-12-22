// SavingsAccount subclass
public class SavingsAccount extends BankAccount {
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