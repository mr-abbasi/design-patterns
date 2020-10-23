package abstractFactory;

/**
 * @author Mohammad.Abbasi
 * @created 23/10/2020
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("SHAPE");
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = factory.getShape("SQUARE");
        square.draw();

        factory = FactoryProducer.getFactory("COLOR");
        Color red = factory.getColor("RED");
        red.fill();

        Color blue = factory.getColor("BLUE");
        blue.fill();

        Color green = factory.getColor("GREEN");
        green.fill();
    }
}
