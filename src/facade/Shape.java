package facade;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
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
