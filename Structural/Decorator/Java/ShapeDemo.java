
interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle.....");
    }

}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

}

abstract class ShapeDecorator implements Shape {
    protected Shape shapeObject;

    ShapeDecorator(Shape shape) {
        this.shapeObject = shape;
    }
    @Override
    public void draw() {
       shapeObject.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator {

    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("extra features by decorators");
    }

}

public class ShapeDemo {
    
    public static void main(String[] args) {
        Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    Shape redCircle = new RedShapeDecorator(circle);
    Shape redRectangle = new RedShapeDecorator(rectangle);

        circle.draw();

        redCircle.draw();

        redRectangle.draw();
    }
}
