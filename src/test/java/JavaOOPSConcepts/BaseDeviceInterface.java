package JavaOOPSConcepts;

public interface BaseDeviceInterface {
    public void basicFunctionality();
}
interface AdvancedDeviceInterface extends BaseDeviceInterface {
    public void advancedFunctionality();
}
class SmartDevice implements AdvancedDeviceInterface{
    @Override
    public void basicFunctionality() {
        System.out.println("Basic Functionality: Device is turning on.");
    }

    @Override
    public void advancedFunctionality() {
        System.out.println("Advanced Functionality: Device is adjusting settings.");
    }
}
