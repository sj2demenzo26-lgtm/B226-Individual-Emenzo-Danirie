// 1. Abstract Class matching all specified fields and the abstract method
abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void displayAccountInfo();
}

// 2. Interface defining the transaction contract
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// 3. Savings Account implementing specific display rules and Transaction methods
class SavingsAccount extends Account implements Transaction {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("--- Savings Account Info ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    @Override
    public void deposit(double amount) {
        balance += amount; // Updates balance
        System.out.println("Deposited " + amount + " into Savings Account.");
        System.out.println("New Balance: " + balance);
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Updates balance
            System.out.println("Withdrew " + amount + " from Savings Account.");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Transaction Failed. Insufficient funds.");
        }
        System.out.println();
    }
}

// 4. Checking Account implementing specific display rules and Transaction methods
class CheckingAccount extends Account implements Transaction {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("--- Checking Account Info ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println();
    }

    @Override
    public void deposit(double amount) {
        balance += amount; // Updates balance
        System.out.println("Deposited " + amount + " into Checking Account.");
        System.out.println("New Balance: " + balance);
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Updates balance
            System.out.println("Withdrew " + amount + " from Checking Account.");
            System.out.println("New Balance: " + balance);
        } else if (amount <= (balance + overdraftLimit)) {
            balance -= amount; // Updates balance using overdraft
            System.out.println("Withdrew " + amount + " from Checking Account.");
            System.out.println("Transaction allowed using overdraft.");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Transaction Failed. Exceeds overdraft limit.");
        }
        System.out.println();
    }
}

// 5. Main class executing the exact matching scenario from your screenshot
public class Activity15_Emenzo {
    public static void main(String[] args) {
        // --- Test Scenario matching your screenshot output 100% ---
        
        // 1. Savings Account Execution
        SavingsAccount savings = new SavingsAccount("SA123", "Danirie", 1500.0, 3.5);
        savings.displayAccountInfo();
        savings.deposit(500.0);
        savings.withdraw(200.0);

        // 2. Checking Account Execution
        CheckingAccount checking = new CheckingAccount("CA456", "Sha", 2500.0, 1000.0);
        checking.displayAccountInfo();
        checking.deposit(1000.0);
        checking.withdraw(3500.0);
    }
}