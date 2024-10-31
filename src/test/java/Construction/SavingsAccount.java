package Construction;

public class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterestRate(){
        balance = balance*(1+interestRate);
        System.out.println("The cumulative account balance: $"+balance);
    }

}
