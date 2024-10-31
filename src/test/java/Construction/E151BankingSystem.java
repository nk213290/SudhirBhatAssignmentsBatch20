package Construction;

public class E151BankingSystem {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount("Sudhir Bhat", 914.58, "4721876641", 0.0525);
        CheckingAccount check = new CheckingAccount("Sudhir Bhat", 46.00, "4721876625");
        save.printAccountInfo();
        check.printAccountInfo();
        // methods
        save.deposit(35.00);
        check.withdraw(51.26);
        save.applyInterestRate();
    }
}
