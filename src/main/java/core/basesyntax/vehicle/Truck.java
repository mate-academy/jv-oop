package core.basesyntax.vehicle;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck ride to destination");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck arrived to destination");
    }
}
