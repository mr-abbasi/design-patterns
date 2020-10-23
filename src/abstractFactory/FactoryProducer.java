package abstractFactory;

/**
 * @author Mohammad.Abbasi
 * @created 23/10/2020
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName) {
        AbstractFactory abstractFactory = null;
        if (factoryName != null) {
            if (factoryName.compareToIgnoreCase("SHAPE") == 0) {
                abstractFactory = new ShapeFactory();
            } else if (factoryName.compareToIgnoreCase("COLOR") == 0) {
                abstractFactory = new ColorFactory();
            }
        }

        return abstractFactory;
    }
}
