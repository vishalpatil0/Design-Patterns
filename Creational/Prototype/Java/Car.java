
public class Car extends Vehicles{

    private int speed;

    Car(int speed, String model, int number) {
        super(number, model);
        this.speed = speed;
    }

    Car(Car car) {
        super(car);
        this.speed = car.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override
    public Prototype cloneObject() {
        return new Car(this);
    }
}
