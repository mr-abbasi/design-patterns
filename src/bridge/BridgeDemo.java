package bridge;

/**
 * @author Mohammad.Abbasi
 * @created 28/10/2020
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Color green = new Green();
        Color blue = new Blue();

        Shape rectangleGreen = new Rectangle(green);
        Shape rectangleBlue = new Rectangle(blue);
        Shape circleGreen = new Circle(green);
        Shape circleBlue = new Circle(blue);
        System.out.println("--------------------------------------");
        rectangleBlue.draw();
        System.out.println("--------------------------------------");
        rectangleGreen.draw();
        System.out.println("--------------------------------------");
        circleBlue.draw();
        System.out.println("--------------------------------------");
        circleGreen.draw();
        System.out.println("--------------------------------------");
    }
}
