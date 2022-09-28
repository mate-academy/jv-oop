package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Truck has started");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Truck has stopped it's work");
    }
}
