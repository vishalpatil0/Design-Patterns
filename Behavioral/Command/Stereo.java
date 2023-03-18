package Behavioral.Command;
public class Stereo {
    private boolean isSwitchtedOn;
    public void setSwitchedOn() {
        System.out.println(isSwitchtedOn);
        isSwitchtedOn = !isSwitchtedOn;
    }
}
