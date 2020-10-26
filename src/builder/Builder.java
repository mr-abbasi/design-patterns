package builder;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public interface Builder {
    void addWheels();

    void addHeadLights();

    void buildBody();

    Product getProduct();
}

class CarBuilder implements Builder {

    private final Product product;

    CarBuilder() {
        product = new Product();
    }

    @Override
    public void addWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public void buildBody() {
        product.add("car body is built");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class MotorCycleBuilder implements Builder {

    private final Product product;

    MotorCycleBuilder() {
        product = new Product();
    }

    @Override
    public void addWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlights are added");
    }

    @Override
    public void buildBody() {
        product.add("motorcycle body is built");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}