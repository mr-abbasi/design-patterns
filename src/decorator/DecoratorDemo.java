package decorator;

/**
 * @author Mohammad.Abbasi
 * @created 30/10/2020
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("--------------------------------------------");
        Shape borderedCircle = new RedBorderShape(circle);
        borderedCircle.draw();
    }
}
