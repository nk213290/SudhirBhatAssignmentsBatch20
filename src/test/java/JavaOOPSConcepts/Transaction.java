package JavaOOPSConcepts;

public interface Transaction {
    public void processTransaction(double amount);
}
interface BankOperations extends Transaction{
    public  double deposit(double amount);
    public  double withdraw(double amount);
    public  double checkBalance();
}
class BankAccount implements BankOperations{
    double balance;
    BankAccount(double balance){
        this.balance= balance;
    }

    @Override
    public double deposit(double amount) {
        balance+=amount;
        processTransaction(amount);
        return balance;
    }
    public double withdraw(double amount){
        if(balance>amount){
            processTransaction(amount);
            balance-=amount;
        }else {
            System.out.println("Transaction failed: Insufficient Funds.");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Current Balance: "+balance);
        return 0;
    }

    @Override
    public void processTransaction(double amount) {
        if(amount>0){
            System.out.println("Transaction successful: Deposit: "+amount);
        }else {
            System.out.println("Transaction successful: Withdrawal: "+amount);
        }
    }
}