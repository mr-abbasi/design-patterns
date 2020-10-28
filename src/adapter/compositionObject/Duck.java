package adapter.compositionObject;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public interface Duck {
    void quack();
    void fly();
}

class MarbleDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
