package factoryMethod;

import factoryMethod.abstractCreator.CircleFactory;
import factoryMethod.abstractCreator.RectangleFactory;
import factoryMethod.abstractCreator.SquareFactory;
import factoryMethod.concretCreator.ShapeFactory;
import factoryMethod.model.Shape;

/**
 * @author Mohammad.Abbasi
 * @created 22/10/2020
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("\nCreate shape according to FactoryMethod-Abstract Creator");

        Shape circle = new CircleFactory().getShape();
        circle.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();

        Shape square = new SquareFactory().getShape();
        square.draw();
        System.out.println("/-----------------------------------------------------/");

        System.out.println("\nCreate shape according to FactoryMethod-Concrete Creator");
        Shape circle1 = new ShapeFactory().getShape("CIRCLE");
        circle1.draw();

        Shape rectangle1 = new ShapeFactory().getShape("RECTANGLE");
        rectangle1.draw();

        Shape square1 = new ShapeFactory().getShape("SQUARE");
        square1.draw();
        System.out.println("/-----------------------------------------------------/");

        System.out.println("\nCreate shape according to FactoryMethod-Static Method Creator");
        Shape circle2 = factoryMethod.staticMethodCreator.ShapeFactory.getShape("CIRCLE");
        circle2.draw();

        Shape rectangle2 = factoryMethod.staticMethodCreator.ShapeFactory.getShape("RECTANGLE");
        rectangle2.draw();

        Shape square2 = factoryMethod.staticMethodCreator.ShapeFactory.getShape("SQUARE");
        square2.draw();
    }
}
