package factoryMethod.abstractCreator;

import factoryMethod.model.Shape;

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

