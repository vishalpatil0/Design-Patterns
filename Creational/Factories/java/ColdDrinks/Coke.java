package ColdDrinks;

import interfaces.Foods;

public class Coke implements Foods{

    @Override
    public void prepare() {
       System.out.println("Preparing yourd coke .......");
    }

    @Override
    public void take() {
       System.out.println("Drinking your cold drinkss........");
    }
    
}
