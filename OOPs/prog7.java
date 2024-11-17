import java.util.Scanner;

class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
        System.out.println("New Balance after interest: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
}
// BankAccountDemo
public class prog7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating Saving Account...");
        SavingAccount savingAccount = new SavingAccount(1001, "Nabin", 50000.0, 7.5);
        savingAccount.displayAccountDetails();
        savingAccount.deposit(1000);
        savingAccount.withdraw(2000);
        savingAccount.addInterest();
        savingAccount.displayAccountDetails();

        System.out.println("\nCreating Current Account...");
        CurrentAccount currentAccount = new CurrentAccount(2001, "Ashish", 30000.0, 1000.0);
        currentAccount.displayAccountDetails();
        currentAccount.deposit(500);
        currentAccount.withdraw(4000);
        currentAccount.displayAccountDetails();

        scanner.close();
    }
}
