package facade;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class FacadeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        ShapeMaker shapeMaker = new ShapeMaker(circle,rectangle);

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
