package JavaOOPSConcepts;

public class Felines {
   private String type;
    // Constructor
    public Felines(String type){
        this.type = type;
    }
    // Eat method
    public void eat(){
        System.out.println("I am a feline eating.");
    }
    // Sleep method
    protected void sleep(){
        System.out.println("I am a feline sleeping.");
    }
    // Making sound
    void makeSound(){
        System.out.println("I am a feline making sound.");
    }
    // Roaming
    private void roam(){
        System.out.println("I am a feline roaming.");
    }
}
class Cat extends Felines{
    public Cat(){
        super("Tabby");
    }
    protected void sleep(){
        System.out.println("cat sleeps a lot");
    }
    public void eat(){
        System.out.println("cat eats");
    }
    @Override
    void makeSound() {
        System.out.println("Cat makes sound.");
    }
}
class kitten1 extends Cat{
    @Override
    public void eat() {
        System.out.println("kitten1 drinks milk");
    }
}
class kitten2 extends Cat{
    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }
}
class kitten3 extends Cat{
    @Override
    public void eat() {
        System.out.println("kitten3 eats everything");
    }
}
