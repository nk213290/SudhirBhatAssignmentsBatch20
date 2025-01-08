package JavaOOPSConcepts;

public class Building {
    String location;
    // Parameterized Constructor
    Building(String location){
        this.location = location;
        System.out.println("The location is  "+location);
    }// Plain constructor
    Building(){
        System.out.println("Building Constructor");
    }
}
