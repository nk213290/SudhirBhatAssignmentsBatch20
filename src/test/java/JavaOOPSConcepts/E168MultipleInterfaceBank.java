package JavaOOPSConcepts;

public class E168MultipleInterfaceBank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100.00);
        bankAccount.deposit(25.75);
        bankAccount.withdraw(140.00);
        bankAccount.checkBalance();
    }
}
