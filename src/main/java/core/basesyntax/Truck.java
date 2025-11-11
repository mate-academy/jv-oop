package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck begins its job...");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck ends his job...");
    }
}
