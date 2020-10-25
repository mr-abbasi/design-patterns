package singleton.eagerEvaluation;

/**
 * @author Mohammad.Abbasi
 * @created 25/10/2020
 */
public class EagerEvaluationDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData(10);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getData());
    }
}
