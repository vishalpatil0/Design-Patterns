
interface ParentCar {
    void design();
}

class BasicCar implements ParentCar {

    @Override
    public void design() {
        System.out.println("Basic car design  ##");
    }
    
}

class decorator implements ParentCar {
    private ParentCar car = null;

    decorator(ParentCar car) {
        this.car = car;
    }

    @Override
    public void design() {
        if(car != null) 
        car.design();
    }
}

class PassengerCar extends decorator {

    PassengerCar() {
        super(null);
    }
    
    PassengerCar(ParentCar car) {
        super(car);
    }
    
    
    @Override
    public void design() {
        super.design();
        System.out.println("Passenger car desing ##");
    }
    
}

class LuxuryCar extends decorator {

    LuxuryCar() {
        super(null);
    }

    LuxuryCar(ParentCar car) {
        super(car);
    }
    
    @Override
    public void design() {
        super.design();
        System.out.println("Luxury car desing ##");
    }
    
}


public class Car {
    public static void main(String[] args) {
        System.out.println("**********Basic Car*************");
        BasicCar basicCar = new BasicCar();
        basicCar.design();

        System.out.println("**********Passenger + Basic Car*************");
        PassengerCar passengerCar = new PassengerCar(basicCar);
        passengerCar.design();

        System.out.println("**********Luxury + Basic Car*************");
        LuxuryCar luxry = new LuxuryCar(basicCar);
        luxry.design();

        System.out.println("**********Luxury + Passenger +Basic Car*************");
        LuxuryCar luxry1 = new LuxuryCar(passengerCar);
        luxry1.design();

        System.out.println("**********Passenger car*************");
        PassengerCar passengerCar2 = new PassengerCar();
        passengerCar2.design();

    }
}
