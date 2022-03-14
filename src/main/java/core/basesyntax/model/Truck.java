package core.basesyntax.model;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Beginning of work Truck!");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Truck!");
    }
}
