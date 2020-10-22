package factoryMethod.abstractCreator;

import factoryMethod.model.Circle;
import factoryMethod.model.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
