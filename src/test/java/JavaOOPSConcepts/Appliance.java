package JavaOOPSConcepts;

public class Appliance {
    // Non-argument Constructor
    Appliance(){
        System.out.println("Appliance Constructor without argument.");
    }// Parameter Constructor
    Appliance(int wattage){
        System.out.println("Wattage is "+wattage);
    }
}
class WashingMachine extends Appliance{
    int capacity;
    // Non-argument Constructor
    WashingMachine(){
        System.out.println("Washing Machine constructor without argument.");
    }// Overloaded Constructor
    WashingMachine(int capacity, int wattage){
        super(wattage);
        System.out.println("Capacity: "+capacity);
    }
}
