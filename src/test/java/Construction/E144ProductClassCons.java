package Construction;

public class E144ProductClassCons {
    public static void main(String[] args) {
        StoreProduct p1 = new StoreProduct("Honey", 29.25, "Condiments", false, 3);
        StoreProduct p2 = new StoreProduct("Stationery", 7.95, 250);
        StoreProduct p3 = new StoreProduct("Cutter", 4.50);
        p1.display();
        p2.display();
        p3.display();
    }
}