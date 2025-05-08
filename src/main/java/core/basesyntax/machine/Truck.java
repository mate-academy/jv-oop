package core.basesyntax.machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped work");
    }
}
