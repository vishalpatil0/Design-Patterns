import Resturants.ChickenBurgerRestaurant;
import Resturants.Restuarent;
import Resturants.VegBurgerResturant;
import interfaces.Foods;

public class demo {
    public static void main(String[] args) {
        Restuarent res = new ChickenBurgerRestaurant();
        Foods bg = res.get();
        bg.take();
        res = new VegBurgerResturant();
        bg = res.get();
        bg.take();
    }
}