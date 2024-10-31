package Construction;

class Vehicle {
    String make;
    int year;
    public Vehicle(String make, int year){
        this.make = make;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("The vehicle: "+make+", Year: "+year);
    }
}
class Automobiles extends Vehicle{
    String model1;
    public Automobiles(String make, int year, String model1){
super(make, year);
this.model1 = model1;
    }
    public void displayCarInfo(){
        super.displayInfo();
        System.out.println("The model is: "+model1);
    }
}