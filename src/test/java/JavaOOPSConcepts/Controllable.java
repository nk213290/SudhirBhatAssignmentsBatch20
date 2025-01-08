package JavaOOPSConcepts;

public interface Controllable {
    public void turnOn();
}
interface Configurable{
    public void configure();
}
class SmartHomeDevice implements Configurable, Controllable{
    @Override
    public void configure() {
        System.out.println("Turning on Smart Home Device");
    }
    @Override
    public void turnOn() {
        System.out.println("Configuring Smart Home Device Settings.");
    }
}
