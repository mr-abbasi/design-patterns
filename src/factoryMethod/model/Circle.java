package factoryMethod.model;

/**
 * @author Mohammad.Abbasi
 * @created 22/10/2020
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside Circle::draw() method");
    }
}
