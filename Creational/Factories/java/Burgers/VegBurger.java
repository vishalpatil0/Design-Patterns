package Burgers;

import interfaces.Foods;

public class VegBurger implements Foods {

    @Override
    public void prepare() {
        System.out.println("cooked vegBurger");
    }

    @Override
    public void take() {
       System.out.println("eating veg burger");
    }
    
}
