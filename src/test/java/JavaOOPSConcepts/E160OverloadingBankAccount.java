package JavaOOPSConcepts;

public class E160OverloadingBankAccount {
    private void displayInfo(){
        System.out.println("private displayInfo method");
    }
    private void displayInfo(int balance){
        System.out.println("private displayInfo method with balance: "+balance);
    }
    public static void displayBankInfo(){
        System.out.println("Static method without parameter.");
    }
    public static void displayBankInfo(int numBranch){
        System.out.println("static method with number of branches: "+numBranch);
    }
    public static void main(String[] args) {
        E160OverloadingBankAccount acc = new E160OverloadingBankAccount();
        acc.displayInfo();
        acc.displayInfo(5000);
        E160OverloadingBankAccount.displayBankInfo();
        E160OverloadingBankAccount.displayBankInfo(2050);

    }
}
