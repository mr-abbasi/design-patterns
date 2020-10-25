package singleton.billPugh;

/**
 * @author Mohammad.Abbasi
 * @created 25/10/2020
 */
public class Singleton {
    private static Singleton instance;
    private int data;

    private Singleton() {
    }

    private static class SingletonHelper {
        public static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
