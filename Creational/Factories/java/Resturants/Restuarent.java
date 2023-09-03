package Resturants;

import interfaces.Foods;

public abstract class  Restuarent {
    public Foods get() {
        Foods food = getFood();
        food.prepare();
        return food;
    }
    protected abstract Foods getFood();
}
