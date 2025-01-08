package JavaOOPSConcepts;

public class E172Encapsulation {
    public static void main(String[] args) {
        Customers customers = new Customers(1234567890,"Sarah Connor","sarah.connor@example.com",15000.0);
        System.out.println("Account Number: "+customers.getAccountNumber());
        System.out.println("Full Name: "+customers.getFullName());
        System.out.println("Email: "+customers.getEmail());
        System.out.println("Balance: "+customers.getBalance());
    }
}
