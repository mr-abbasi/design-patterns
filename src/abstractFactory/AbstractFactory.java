package abstractFactory;

/**
 * @author Mohammad.Abbasi
 * @created 23/10/2020
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeName);

    abstract Color getColor(String colorName);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeName) {
        Shape shape = null;
        if (shapeName != null) {
            if (shapeName.compareToIgnoreCase("CIRCLE") == 0) {
                shape = new Circle();
            } else if (shapeName.compareToIgnoreCase("SQUARE") == 0) {
                shape = new Square();
            } else if (shapeName.compareToIgnoreCase("RECTANGLE") == 0) {
                shape = new Rectangle();
            }
        }

        return shape;
    }

    @Override
    Color getColor(String colorName) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeName) {
        return null;
    }

    @Override
    Color getColor(String colorName) {
        Color color = null;
        if (colorName != null) {
            if (colorName.compareToIgnoreCase("BLUE") == 0) {
                color = new Blue();
            } else if (colorName.compareToIgnoreCase("GREEN") == 0) {
                color = new Green();
            } else if (colorName.compareToIgnoreCase("RED") == 0) {
                color = new Red();
            }
        }

        return color;
    }
}
