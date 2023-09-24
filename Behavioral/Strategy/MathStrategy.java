

interface strategy {
    void doOperation(int a, int b);
}

class AddStrategy implements strategy {
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println(num1+num2);
    }
}

class SubStrategy implements strategy { 
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println(num2-num1);
    }
}

class Calculator {
    strategy str;

    Calculator() {
        str = null;
    }

    public void setStrategy(strategy str) {
        this.str = str;
    }

    public void doOperation(int num1, int num2) {
        str.doOperation(num1, num2);
    }
}
public class MathStrategy {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new AddStrategy());
        calculator.doOperation(3, 5);
        calculator.setStrategy(new SubStrategy());
        calculator.doOperation(34, 2);
    }
}
