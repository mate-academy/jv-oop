package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm Truck! I'm starting!");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm Truck! I'm stopping.");
    }
}
