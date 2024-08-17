package core.basesyntax.vehicles;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck is working");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck is stopped");
    }
}
