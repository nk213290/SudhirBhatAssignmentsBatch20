package Construction;

public class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    // main constructor
    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
        // second constructor
        StoreProduct(String label, double price, int stock){
            this.label = label;
            this.price = price;
            this.category = "misc";
            this.hasExpiration = false;
            this.stock = stock;
        }// third constructor
    StoreProduct(String label, double price){
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = 0;
    }// display
    public void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}
