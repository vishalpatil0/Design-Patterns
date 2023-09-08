import java.util.ArrayList;
import java.util.List;

interface Component {
    void showPrice();
}

class Composite implements Component {
    List<Component> leafs = new ArrayList<>();

    void add(Component c) {
        leafs.add(c);
    }
    @Override
    public void showPrice() {
        for (Component c : leafs) {
           c.showPrice();
        }
    }  
}

class Leaf implements Component {
    int price;
    String name;

    Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println("name --> "+name+" ||| price --> "+price);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Composite computer = new Composite();
        
        Composite peripheral = new Composite();

        Component mouse = new Leaf(400, "Mouse");
        Component keyboard = new Leaf(1500, "keyboard");

        peripheral.add(mouse);
        peripheral.add(keyboard);

        Composite cpu = new Composite();

        Component motherboard = new Leaf(10000, "MotherBoard");
        Component hardDisk = new Leaf(6000, "HardDisk");
        Component ram = new Leaf(8000, "RAM");

        cpu.add(motherboard);
        cpu.add(hardDisk);
        cpu.add(ram);

        computer.add(peripheral);
        computer.add(cpu);
        
        computer.showPrice();
    }
}