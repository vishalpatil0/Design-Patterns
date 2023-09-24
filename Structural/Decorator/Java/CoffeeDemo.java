// Component interface
interface Coffee {
    double cost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0; // Basic coffee cost
    }
}

// Decorator abstract class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}

// Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Add cost of milk
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2; // Add cost of sugar
    }
}

// Client Code
public class CoffeeDemo {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: $" + coffee.cost());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost of Coffee with Milk: $" + milkCoffee.cost());

        // Add sugar to the coffee
        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of Coffee with Milk and Sugar: $" + sugarCoffee.cost());
    }
}
