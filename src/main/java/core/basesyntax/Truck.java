package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has now started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truckпше's operation was suspended");
    }
}
