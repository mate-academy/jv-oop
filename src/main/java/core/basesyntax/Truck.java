package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is starting to do work!");
    }

    @Override
    public void doStop() {
        System.out.println("Truck is stopping to do work!");
    }
}
