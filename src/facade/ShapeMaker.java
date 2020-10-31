package facade;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;

    ShapeMaker(Shape circle,Shape rectangle){
        this.circle = circle;
        this.rectangle = rectangle;
    }

    void drawCircle(){
        circle.draw();
    }

    void drawRectangle(){
        rectangle.draw();
    }
}
