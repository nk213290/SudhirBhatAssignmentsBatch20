package Construction;

public class E148ShoppingStore {
    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore item2 = new ShoppingStore("Mattress", 219.59, 2);
        double total1 = item1.itemTotalPrice();
        double total2 = item2.itemTotalPrice();
        System.out.println("You purchased "+(total1+total2)+"Today");
        }
    }

