package adapter.classInheritance;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class DuckAdapter extends Duck {
    private final Turkey turkey;

    public DuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
