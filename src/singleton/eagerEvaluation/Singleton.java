package singleton.eagerEvaluation;

/**
 * @author Mohammad.Abbasi
 * @created 25/10/2020
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private int data;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
