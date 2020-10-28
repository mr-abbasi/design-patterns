package bridge;

/**
 * @author Mohammad.Abbasi
 * @created 28/10/2020
 */
public abstract class Shape {
    protected final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.fill();
        System.out.println("rectangle");
    }
}

class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        this.color.fill();
        System.out.println("circle");
    }
}
