package ColdDrinks;

import interfaces.Foods;

public class Pepsi implements Foods{

    @Override
    public void prepare() {
        System.out.println("Preparing your pepsi..........");
    }

    @Override
    public void take() {
        System.out.println("Drinking your cold drinks.......");
    }
    
}
