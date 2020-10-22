package factoryMethod.abstractCreator;

import factoryMethod.model.Rectangle;
import factoryMethod.model.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
