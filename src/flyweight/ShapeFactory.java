package flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Mohammad.Abbasi
 * @created 03/11/2020
 */
public class ShapeFactory {
    private Map<String, Shape> shapeCache = new LinkedHashMap<>();
    public Shape getShape(String shapeType) {

        Shape shape = null;

        shapeType = shapeType.toLowerCase();
        if (shapeCache.containsKey(shapeType)) {
            shape = shapeCache.get(shapeType);
        } else {
            if (shapeType.compareToIgnoreCase("circle") == 0) {
                System.out.println("creating circle Shape");
                shape = new Circle();
                shapeCache.put(shapeType, shape);
            } else if (shapeType.compareToIgnoreCase("rectangle") == 0) {
                System.out.println("creating rectangle Shape");
                shape = new Rectangle();
                shapeCache.put(shapeType, shape);
            }
        }

        return shape;
    }
}
