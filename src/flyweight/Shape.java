package flyweight;

/**
 * @author Mohammad.Abbasi
 * @created 03/11/2020
 */
public interface Shape {
    void draw();

    void setColor(String color);
}

class Circle implements Shape {

    private String borderColor;

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method with border color " + getBorderColor());
    }

    @Override
    public void setColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {

    private String fillColor;

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method with fill color " + getFillColor());
    }

    @Override
    public void setColor(String color) {
        this.fillColor = color;
    }

    public String getFillColor() {
        return fillColor;
    }
}
