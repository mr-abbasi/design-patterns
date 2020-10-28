package adapter.compositionObject;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public interface Turkey {
    void gobble();
    void fly();
}

class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying short distance");
    }
}
