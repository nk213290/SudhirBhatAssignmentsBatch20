package Construction;

public class ShoppingStore {
    private String item;
    private double price;
    private int quantity;
    // Create Constructor
    ShoppingStore(String item, double price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }// Create method
     double itemTotalPrice(){
        double inventory = price*quantity;
        System.out.println("Item total value: "+inventory);
        return inventory;
    }
}
