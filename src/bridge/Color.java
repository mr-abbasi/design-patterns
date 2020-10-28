package bridge;

/**
 * @author Mohammad.Abbasi
 * @created 28/10/2020
 */
public interface Color {
    void fill();
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("green");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("blue");
    }
}
