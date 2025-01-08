package JavaOOPSConcepts;

public class E170StoreManagement {
    public static void main(String[] args) {
        Customer customer= new Customer();
        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);
        System.out.println("Customer Name: "+customer.getCustomerName());
        System.out.println("Customer Age: "+customer.getCustomerAge());
    }
}
