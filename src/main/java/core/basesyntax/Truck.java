package core.basesyntax;

public abstract class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped");
    }
}
