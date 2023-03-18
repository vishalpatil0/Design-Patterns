package Behavioral.Command;
public class MainClass {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.setCommand(new LightOnCommand(new Light()));
        remote.buttonPressed();
        remote.setCommand(new StereoOnCommand(new Stereo()));
        remote.buttonPressed();
    }  
}
