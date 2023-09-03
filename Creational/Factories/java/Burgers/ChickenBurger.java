package Burgers;

import interfaces.Foods;

public class ChickenBurger implements Foods{

    @Override
    public void prepare() {
        System.out.println("Cooking chicken burger");
    }

    @Override
    public void take() {
        System.out.println("Eating veg burger.....");
    }
    
}
