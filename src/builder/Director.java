package builder;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class Director {
    public Product construct(Builder builder) {
        builder.buildBody();
        builder.addWheels();
        builder.addHeadLights();

        return builder.getProduct();
    }
}
