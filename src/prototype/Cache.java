package prototype;

import java.util.HashMap;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class Cache {
    private static final HashMap<String, Shape> cacheMap = new HashMap<>();

    public static Shape get(String id) {
        Shape shape = cacheMap.get(id);

        return shape.clone();
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        cacheMap.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        cacheMap.put(rectangle.getId(), rectangle);
    }
}
