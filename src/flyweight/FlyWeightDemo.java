package flyweight;

/**
 * @author Mohammad.Abbasi
 * @created 03/11/2020
 */
public class FlyWeightDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle1 = shapeFactory.getShape("CIRCLE");
        circle1.setColor("red");
        circle1.draw();
        Shape circle2 = shapeFactory.getShape("CIRCLE");
        circle2.setColor("blue");
        circle2.draw();

        Shape rectangle1 = shapeFactory.getShape("rectangle");
        rectangle1.setColor("red");
        rectangle1.draw();
        Shape rectangle2 = shapeFactory.getShape("rectangle");
        rectangle2.setColor("blue");
        rectangle2.draw();
    }
}
