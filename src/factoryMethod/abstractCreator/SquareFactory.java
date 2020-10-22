package factoryMethod.abstractCreator;

import factoryMethod.model.Shape;
import factoryMethod.model.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
