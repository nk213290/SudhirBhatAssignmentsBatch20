package JavaOOPSConcepts;

public class Customer {
    private String customerName;
    private int customerAge;

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int age) {
        this.customerAge = age;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }
}
