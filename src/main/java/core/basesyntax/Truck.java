package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started its work...");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped its work...");
    }
}
