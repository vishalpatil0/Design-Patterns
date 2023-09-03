
public class Demo {
    public static void main(String[] args) {
        Car c = new Car(12,"s",2);
        Prototype c1 = c.cloneObject();
        c.setSpeed(34);
        System.out.println("c speed --> "+c.getSpeed());
        ((Car) c1).setSpeed(98);
        System.out.println("c speed --> "+c.getSpeed());


        
        
    }
}
