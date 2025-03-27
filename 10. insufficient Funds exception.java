//insufficient funds exception 
// Define a custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate the custom exception
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0); // Initial balance

        try {
            account.deposit(200.0);
            System.out.println("Current Balance: " + account.getBalance());

            account.withdraw(100.0);
            System.out.println("Current Balance: " + account.getBalance());

            account.withdraw(700.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}