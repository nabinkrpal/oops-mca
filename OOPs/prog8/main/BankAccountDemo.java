package main;

import bank.BankAccount;
import bank.SavingAccount;
import bank.CurrentAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("Creating Saving Account...");
        SavingAccount savingAccount = new SavingAccount(1001, "Nabin", 50000.0, 7.5);
        savingAccount.displayAccountDetails();
        savingAccount.deposit(1000);
        savingAccount.withdraw(2000);
        savingAccount.addInterest();
        savingAccount.displayAccountDetails();

        System.out.println("\nCreating Current Account...");
        CurrentAccount currentAccount = new CurrentAccount(2001, "Ashish", 31000.0, 1000.0);
        currentAccount.displayAccountDetails();
        currentAccount.deposit(500);
        currentAccount.withdraw(4000);
        currentAccount.displayAccountDetails();
    }
}
// prpg8> javac bank/*.java main/*.java
// java main.BankAccountDemo


