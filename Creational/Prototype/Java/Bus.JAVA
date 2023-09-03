

public class Bus extends Vehicles {
    
    private int tyres;

    Bus(int tyres, int number, String model) {
        super(number, model);
        this.tyres = tyres;
    }

    Bus(Bus bus) {
        super(bus);
        this.tyres = bus.tyres;
    }
    
    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    @Override
    public Prototype cloneObject() {
       return new Bus(this); 
    }
}