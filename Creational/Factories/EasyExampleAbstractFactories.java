/**
 * Abstract factories are used to create factory of factories.
 * 
 * Suppose there are multiple child of same class so to categorize them you add one more level of inheritence in between 
 * them.
 * Earlier -> parent -> child
 * Now -> parent -> category -> child
 * 
 * to adopt the new pattern you also create multiple factories as per category of products.
 * 
 * So if user is not sure which object he need
 * first he can get the factory and the he can get the product object with that category factory
 */

interface Vehicle {
    void book(int distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}

abstract class Car implements Vehicle {
    String carType;
    int baseCost;
    int chargesPerUnitDistance;

    @Override
    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + carType + " Car for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    @Override
    public int calculateCostOfBooking(int distance){
        int serviceCharge = 3;
        return baseCost + chargesPerUnitDistance * distance + serviceCharge;
    }
}

class MicroCar extends Car {

    public MicroCar(){};

    @Override
    public void setVehicleType(){
        carType = "Micro";
    }

    @Override
    public void setBaseCost(){
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}

class MiniCar extends Car {

    public MiniCar(){};

    @Override
    public void setVehicleType(){
        carType = "Mini";
    }

    @Override
    public void setBaseCost(){
        baseCost = 100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 20;
    }
}

class MegaCar extends Car {

    public MegaCar(){};

    @Override
    public void setVehicleType(){
        carType = "Mega";
    }

    @Override
    public void setBaseCost(){
        baseCost = 150;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 30;
    }
}

abstract class Auto implements Vehicle {
    String shareType;
    int baseCost;
    int chargesPerUnitDistance;

    @Override
    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + shareType + " Autorickshaw for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    @Override
    public int calculateCostOfBooking(int distance){
        int serviceCharge = 1;
        return baseCost + chargesPerUnitDistance * distance + serviceCharge;
    }
}

class PersonalAuto extends Auto {

    public PersonalAuto(){}

    @Override
    public void setVehicleType(){
        shareType = "Personal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 10;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}

class SharedAuto extends Auto {

    public SharedAuto(){}

    @Override
    public void setVehicleType(){
        shareType = "Shared";
    }

    @Override
    public void setBaseCost(){
        baseCost = 0;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}

abstract class Bike implements Vehicle {
    String bikeType;
    int baseCost;
    int chargesPerUnitDistance;

    @Override
    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + bikeType + " Bike for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    @Override
    public int calculateCostOfBooking(int distance){
        return baseCost + chargesPerUnitDistance * distance;
    }
}

class SportsBike extends Bike {

    public SportsBike(){}

    @Override
    public void setVehicleType(){
        bikeType = "Sports";
    }

    @Override
    public void setBaseCost(){
        baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}

class NormalBike extends Bike {

    public NormalBike(){}

    @Override
    public void setVehicleType(){
        bikeType = "Normal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 5;
    }
}

abstract class AbstractVehicleFactory {
    public abstract Vehicle getVehicle(String type);
}

class CarFactory extends AbstractVehicleFactory {
	
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("Micro")) {
            return new MicroCar();
        }
        else if(type.equalsIgnoreCase("Mini")) {
            return new MiniCar();
        }
        else if(type.equalsIgnoreCase("Mega")) {
            return new MegaCar();
        }
        else{
            return new MiniCar();
        }
    }
}

class AutoFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Personal")) {
            return new PersonalAuto();
        }
        else if(type.equalsIgnoreCase("Shared")) {
            return new SharedAuto();
        }
        else{
            return new PersonalAuto();
        }
    }
}


class BikeFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Normal")) {
            return new NormalBike();
        }
        else if(type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        }
        else{
            return new NormalBike();
        }
    }
}

class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){   
        if(factoryType.equalsIgnoreCase("Car")) {
            return new CarFactory();         
        } else if(factoryType.equalsIgnoreCase("Auto")) {
            return new AutoFactory();
        }
        else if(factoryType.equalsIgnoreCase("Bike")) {
            return new BikeFactory();
        } else {
            return new CarFactory();
        }
    }
}



public class EasyExampleAbstractFactories {
    public static void main(String[] args) {
        int distance = 10;

        /*
        * Book a Mini Car for a distance of 10 kms
        */
        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle miniCar = carFactory.getVehicle("Mini");
        miniCar.book(distance);


        /*
        * Book a Personal Auto for a distance of 10 kms
        */
        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
        Vehicle personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(distance);


        /*
        * Book a Sports Bike for a distance of 10 kms
        */
        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
        Vehicle sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);
    }
}
