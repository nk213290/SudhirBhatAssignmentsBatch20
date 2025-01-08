package JavaOOPSConcepts;

public class E157MethodOverloading {
    public static void main(String[] args) {
        TransactionCalculator tc = new TransactionCalculator();
        System.out.println(tc.calculateProfit(100,30,10,20));
        System.out.println(tc.calculateProfit(80,30,20));
        System.out.println(tc.calculateProfit(50,30));
    }
}
