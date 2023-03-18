package Behavioral.Command;
public class Light {
    private boolean isSwitchtedOn;
    public void setSwitchedOn() {
        System.out.println(isSwitchtedOn);
        isSwitchtedOn = !isSwitchtedOn;
    }
}
