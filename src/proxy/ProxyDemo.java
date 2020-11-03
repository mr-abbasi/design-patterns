package proxy;

/**
 * @author Mohammad.Abbasi
 * @created 02/11/2020
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("myFile");

        image.display();
        System.out.println("-----------------------");
        image.display();
    }
}
