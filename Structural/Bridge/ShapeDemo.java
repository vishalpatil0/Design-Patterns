// Implementation interface
interface Renderer {
    void renderCircle(int radius);
    void renderSquare(int side);
}

// Concrete implementations
class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(int radius) {
        System.out.println("Rendering a circle of radius " + radius + " using VectorRenderer");
    }

    @Override
    public void renderSquare(int side) {
        System.out.println("Rendering a square with side " + side + " using VectorRenderer");
    }
}

class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(int radius) {
        System.out.println("Drawing a pixelated circle of radius " + radius + " using RasterRenderer");
    }

    @Override
    public void renderSquare(int side) {
        System.out.println("Drawing a pixelated square with side " + side + " using RasterRenderer");
    }
}

// Abstraction classes
abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}

class Square extends Shape {
    private int side;

    public Square(Renderer renderer, int side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}

// Client code
public class ShapeDemo {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape square = new Square(rasterRenderer, 4);

        circle.draw();
        square.draw();
    }
}
