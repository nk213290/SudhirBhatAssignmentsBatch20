package Construction;

public class CheckingAccount extends BankAccount {
double overdraftLimit;
    CheckingAccount(String accountHolderName, double balance, String accountNumber) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = -100.00;
    }
    public double withdraw(double amount){
        if((balance-amount)>overdraftLimit){
            balance-=amount;
            System.out.println("The balance is:$ "+balance);
        }else {
            System.out.println("Overdraft exceeded");
        }
        return balance;
    }

}
