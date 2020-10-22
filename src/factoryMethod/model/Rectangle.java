package factoryMethod.model;

/**
 * @author Mohammad.Abbasi
 * @created 22/10/2020
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside Rectangle::draw() method");
    }
}
