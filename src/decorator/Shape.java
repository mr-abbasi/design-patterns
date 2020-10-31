package decorator;

/**
 * @author Mohammad.Abbasi
 * @created 30/10/2020
 */
public interface Shape {
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
