import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface vehicle {
    double internalWidth();
}
class Car implements vehicle{

    @Override
    public double internalWidth() {
        return this.cabinWidth();
    }
    
    private double cabinWidth() {
        return new Random().nextDouble()*10+1;
    }
}

class RacingCar implements vehicle{

    @Override
    public double internalWidth() {
        return this.cockpitWidth();
    }

    private double cockpitWidth() {
        return new Random().nextDouble()*10+1;
    }
}
 
public class Liskov_Substitution_principle {
    public static void main(String[] args) {
        vehicle A = new Car();
        vehicle B = new Car();
        vehicle C = new RacingCar();  
        
        List<vehicle> vehicles = new ArrayList<>();
        vehicles.add(A);
        vehicles.add(B);
        vehicles.add(C);

        for(vehicle v : vehicles) {
            System.out.println(v.internalWidth());
        }
    }
}