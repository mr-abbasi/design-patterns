package singleton.synchronizedMethod;

/**
 * @author Mohammad.Abbasi
 * @created 25/10/2020
 */
public class Singleton {
    private static Singleton instance;

    private int data = 0;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
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
