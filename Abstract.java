// Abstract base class
abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract method for deposit
    public abstract void deposit(double amount);

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Implement the deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        double currentBalance = getBalance();
        currentBalance += amount;
        setBalance(currentBalance);
        System.out.println("Deposited: $" + amount);
    }

    // Implement the withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance >= amount) {
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Helper method to set the balance
    private void setBalance(double newBalance) {
        super.balance = newBalance;
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Implement the deposit method for CurrentAccount
    @Override
    public void deposit(double amount) {
        double currentBalance = getBalance();
        currentBalance += amount;
        setBalance(currentBalance);
        System.out.println("Deposited: $" + amount);
    }

    // Implement the withdraw method for CurrentAccount
    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        double availableBalance = currentBalance + overdraftLimit;
        if (availableBalance >= amount) {
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Helper method to set the balance
    private void setBalance(double newBalance) {
        super.balance = newBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount and perform operations
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 1000.0, 0.05);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        System.out.println("Updated Savings Account Balance: $" + savingsAccount.getBalance());

        // Create a CurrentAccount and perform operations
        CurrentAccount currentAccount = new CurrentAccount("CA67890", 2000.0, 500.0);
        System.out.println("Current Account Balance: $" + currentAccount.getBalance());
        currentAccount.deposit(800.0);
        currentAccount.withdraw(2500.0);
        System.out.println("Updated Current Account Balance: $" + currentAccount.getBalance());
    }
}
