package core.basesyntax.model;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck was started it's work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck was stopped it's work!");
    }
}
