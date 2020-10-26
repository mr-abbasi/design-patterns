package builder;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new CarBuilder();
        Builder motorCycleBuilder = new MotorCycleBuilder();

        Product car = director.construct(carBuilder);
        Product motorCycle = director.construct(motorCycleBuilder);

        System.out.println("\n");
        car.show();
        System.out.println("----------------------------");

        motorCycle.show();
        System.out.println("----------------------------");
    }
}
