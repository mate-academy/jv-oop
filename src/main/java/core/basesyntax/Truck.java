package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truc do work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truc stop work");
    }
}
