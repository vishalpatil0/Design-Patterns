abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();
}

class VegPizza extends Pizza {

    @Override
    public void assemble() {
       System.out.println("Adding sauce");
       System.out.println("Adding toppings");
       System.out.println("Adding cheese");
    }

    @Override
    public void qualityCheck() {
        System.out.println("crust is "+crust);
    }

}

class ChickenPizza extends Pizza {

    @Override
    public void assemble() {
       System.out.println("Adding sauce");
       System.out.println("Adding toppings");
       System.out.println("Adding chicken");
    }

    @Override
    public void qualityCheck() {
        System.out.println("crust is "+crust);
    }
}

abstract class Restaurant {
    protected Pizza pizza;

    Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addTopping();
    protected abstract void makeCrust();
    public void deliver() {
       makeCrust();
       addSauce();
       addTopping();
       pizza.assemble();
       pizza.qualityCheck();
       System.out.println("Order in progresss........"); 
    }
}

class AmericanRestaurant extends Restaurant {

    AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding sauce");
    }

    @Override
    protected void addTopping() {
        System.out.println("Adding every toppings");
    }

    @Override
    protected void makeCrust() {
        System.out.println("making thick crust..");
    }
}

class ItallianRestaurant extends Restaurant {

    ItallianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding spicy sauce");
    }

    @Override
    protected void addTopping() {
        System.out.println("No toppings");
    }

    @Override
    protected void makeCrust() {
        System.out.println("making thin crust..");
    }

}

public class PizzaExample {
 public static void main(String[] args) {
    Pizza veg = new VegPizza();
    Pizza chicPizza = new ChickenPizza();

    System.out.println("veg pizza");
    Restaurant ameriRestaurant = new AmericanRestaurant(veg);
    ameriRestaurant.deliver();
    Restaurant iRestaurant = new ItallianRestaurant(veg);
    iRestaurant.deliver();

    System.out.println("chicken pizza");
    Restaurant itallian = new ItallianRestaurant(chicPizza);
    itallian.deliver();
    Restaurant ameriRestaura = new AmericanRestaurant(chicPizza);
    ameriRestaura.deliver();

 }   
}
