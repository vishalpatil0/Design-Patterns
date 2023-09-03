package Resturants;

import interfaces.Foods;
import Burgers.VegBurger;

public class VegBurgerResturant extends Restuarent{

    @Override
    protected Foods getFood() {
        return new VegBurger();
    }
    
}
