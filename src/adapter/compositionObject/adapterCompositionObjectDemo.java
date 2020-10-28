package adapter.compositionObject;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class adapterCompositionObjectDemo {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        DuckAdapter duckAdapter = new DuckAdapter(turkey);

        testDuck(duckAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

