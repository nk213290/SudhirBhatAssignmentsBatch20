package Construction;

public class CarObject {
    String model;
    double price;
    int quantity;
    CarObject(String model, double price, int quantity){
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public void carStockValue(){
        double total = price*quantity;
        System.out.println(model+" Stock Value: $"+total);
    }
}
