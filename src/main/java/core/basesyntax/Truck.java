package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is now working on transporting goods.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has finished transporting goods and is now stopped.");
    }
}
