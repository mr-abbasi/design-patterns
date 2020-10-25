package singleton.doubleCheck;

/**
 * @author Mohammad.Abbasi
 * @created 25/10/2020
 */
public class Singleton {
    private static volatile Singleton instance;
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
