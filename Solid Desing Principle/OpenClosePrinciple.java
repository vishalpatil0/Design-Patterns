//In this example you can add multiple insurance profile wihout modifying the insurance calculator logic

import java.util.Random;

interface InsuranceProfile {
    boolean isLoyalConstumer();
}

class HealthInsuranceProfile implements InsuranceProfile {

    @Override
    public boolean isLoyalConstumer() {
        return new Random().nextBoolean();   
    }
}

class VehicleInsuranceProfile implements InsuranceProfile {

    @Override
    public boolean isLoyalConstumer() {
        return new Random().nextBoolean();   
    }
}

class HomeInsuranceProfile implements InsuranceProfile {

    @Override
    public boolean isLoyalConstumer() {
        return new Random().nextBoolean();   
    }
}

class InsuranceCalculator {
    public void calculateDiscount(InsuranceProfile ip) {
        if (ip.isLoyalConstumer()) {
            System.out.println("discout in 1.2%");
        }
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        InsuranceCalculator insuranceCalculator = new InsuranceCalculator();
        insuranceCalculator.calculateDiscount(new HealthInsuranceProfile());
        insuranceCalculator.calculateDiscount(new HomeInsuranceProfile());
        insuranceCalculator.calculateDiscount(new VehicleInsuranceProfile());
    }
}
