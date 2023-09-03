

public abstract class Vehicles implements Prototype{
    private int number;
    private String model;
    Vehicles(int number, String model) {
        this.model = model;
        this.number = number;
    }

    Vehicles(Vehicles vehicle) {
        this.model = vehicle.model;
        this.number = vehicle.number;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }
 }
