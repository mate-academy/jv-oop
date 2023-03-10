package core.basesyntax;

/**
 * The class defines the type of machine - a truck.
 */
public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work.");
    }
}
