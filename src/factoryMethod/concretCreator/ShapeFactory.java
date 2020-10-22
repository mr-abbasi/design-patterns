package factoryMethod.concretCreator;

import factoryMethod.model.Circle;
import factoryMethod.model.Rectangle;
import factoryMethod.model.Shape;
import factoryMethod.model.Square;

/**
 * @author Mohammad.Abbasi
 * @created 22/10/2020
 */
public class ShapeFactory {
    public Shape getShape(String shapeName) {
        Shape shape = null;
        if (shapeName != null) {
            if (shapeName.compareToIgnoreCase("CIRCLE") == 0) {
                shape = new Circle();
            } else if (shapeName.compareToIgnoreCase("RECTANGLE") == 0) {
                shape = new Rectangle();
            } else if (shapeName.compareToIgnoreCase("SQUARE") == 0) {
                return new Square();
            }
        }

        return shape;
    }
}
