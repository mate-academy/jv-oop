package core.basesyntax.models;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started doing work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped doing work.");
    }
}
