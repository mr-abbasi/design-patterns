package factoryMethod.abstractCreator;

import factoryMethod.model.Circle;
import factoryMethod.model.Rectangle;
import factoryMethod.model.Shape;
import factoryMethod.model.Square;

/**
 * @author Mohammad.Abbasi
 * @created 22/10/2020
 */
public abstract class ShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return this.factoryMethod();
    }
}

