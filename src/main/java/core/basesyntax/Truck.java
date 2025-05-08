package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starts trucking around");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck just stopped trucking");
    }
}
