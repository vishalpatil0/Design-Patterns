package Resturants;

import interfaces.Foods;
import Burgers.ChickenBurger;

public class ChickenBurgerRestaurant extends Restuarent {

    @Override
    protected Foods getFood() {
        return new ChickenBurger();
    }
    
}
