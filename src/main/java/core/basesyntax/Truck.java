package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Me TRUCK, me do work!");
    }

    @Override
    public void stopWork() {
        System.out.println("TRUCK stop work, TRUCK go sleep!");
    }
}
