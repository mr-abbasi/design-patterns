package prototype;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public abstract class Shape implements Cloneable {
    private String id;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shape clone() {
        Shape shape = null;
        try {
            shape = (Shape) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return shape;
    }

    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
