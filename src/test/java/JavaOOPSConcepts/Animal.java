package JavaOOPSConcepts;

public class Animal {
    String sound = "Some generic animal sound";
}
class Canine extends Animal{
    String sound = "howl";
    public void displaySound(){
        System.out.println(sound);
        System.out.println(super.sound);
    }
}