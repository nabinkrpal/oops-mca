package bank;

public class SavingAccount extends BankAccount {
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
