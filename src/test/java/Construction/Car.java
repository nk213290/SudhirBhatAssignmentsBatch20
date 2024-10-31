package Construction;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topspeed;    // km/h
    double price;
    // first constructor
    public Car(String make, String model, int numberOfDoors, int topspeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topspeed = topspeed;
        this.price = price;
    }// second constructor
    public Car(String make, String model,  int topspeed, double price){
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topspeed = topspeed;
        this.price = price;
    }// third constructor
    public Car(int numberOfDoors, int topspeed, double price){
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topspeed = topspeed;
        this.price = price;
    }// fourth constructor
    public Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topspeed = 90;
        price = 0.0;
    }
    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topspeed+" km/h  "+price);
    }
}
