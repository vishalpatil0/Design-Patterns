/**
 * In this example
 * 
 * remote control acts as an bridge.
 * 
 * both device and remote control implementation can work inedenpendently
 * 
 * in simpler terms
 * -> RemoteControl class have the interface (data type) property, means it take the the 
 * concrete class of that implementation
 * so you differnt concrete class to the RemotecControl class.
 * 
 * e.g: there are 
 *  -> TV & Radio
 *  -> BasicRemote & AdvancedRemote
 * 
 * you can use them with each other with bidge design pattern
 * 
 * otherwise you had to create cartesian product like -> BasicTvRemote && BasicRadioRemote
 */


// Implementation hierarchy
interface Device {
    void turnOn();
    void turnOff();
}

class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }
}
// Abstraction hierarchy
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();
    abstract void turnOff();
}

class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    void turnOn() {
        System.out.print("Basic Remote: ");
        device.turnOn();
    }

    @Override
    void turnOff() {
        System.out.print("Basic Remote: ");
        device.turnOff();
    }
}


public class EasyExample {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl remoteForTV = new BasicRemoteControl(tv);
        RemoteControl remoteForRadio = new BasicRemoteControl(radio);

        remoteForTV.turnOn(); // Output: Basic Remote: TV is ON
        remoteForTV.turnOff(); // Output: Basic Remote: TV is OFF

        remoteForRadio.turnOn(); // Output: Basic Remote: Radio is ON
        remoteForRadio.turnOff(); // Output: Basic Remote: Radio is OFF
    }
}
