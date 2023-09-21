// Abstract BankAccount class
abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Abstract deposit method
    public abstract void deposit(double amount);

    // Abstract withdraw method
    public abstract void withdraw(double amount);

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Implement deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Implement withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    // Method to calculate interest
    public void addInterest() {
        balance += (balance * interestRate / 100.0);
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Implement deposit method for CurrentAccount
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Implement withdraw method for CurrentAccount
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a SavingsAccount and depositing and withdrawing money
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 5.0);
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Creating a CurrentAccount and depositing and withdrawing money
        CurrentAccount currentAccount = new CurrentAccount(2000.0, 1000.0);
        currentAccount.deposit(800.0);
        currentAccount.withdraw(2500.0);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
