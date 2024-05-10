package core.basesyntax.machines;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck! Started work...");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck! Stopped work...");
    }

}
