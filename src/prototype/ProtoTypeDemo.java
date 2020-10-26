package prototype;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class ProtoTypeDemo {
    public static void main(String[] args) {
        Cache.loadCache();

        Shape circle = Cache.get("1");
        circle.draw();

        Shape rectangle = Cache.get("2");
        rectangle.draw();
    }

}
