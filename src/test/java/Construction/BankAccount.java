package Construction;

public class BankAccount {
    String accountHolderName;
    protected double balance;
    protected String accountNumber;
    // Create constructor
    BankAccount(String accountHolderName, double balance, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }// Deposit
    public double deposit(double amount){
        balance+=amount;
        return balance;
    }// Withdrawal
    public double withdraw(double amount){
        if(balance>amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient Funds");
        }
        return balance;
    }// Display Iformation
    public void printAccountInfo(){
        System.out.println("Name: "+accountHolderName+" Account Number: "+accountNumber+" Balance: $"+balance);
    }
}

