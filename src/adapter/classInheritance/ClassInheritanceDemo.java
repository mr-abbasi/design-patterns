package adapter.classInheritance;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class ClassInheritanceDemo {
    public static void main(String[] args) {
         Turkey turkey = new Turkey();
         DuckAdapter duckAdapter = new DuckAdapter(turkey);
         testDuck(duckAdapter);
    }

    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
