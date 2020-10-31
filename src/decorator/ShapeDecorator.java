package decorator;

/**
 * @author Mohammad.Abbasi
 * @created 30/10/2020
 */
public class ShapeDecorator implements Shape {
    protected final Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

class RedBorderShape extends ShapeDecorator {

    public RedBorderShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder();
    }

    public void setBorder() {
        System.out.println("Red Border");
    }
}
