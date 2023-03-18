package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck do work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop work");
    }
}
