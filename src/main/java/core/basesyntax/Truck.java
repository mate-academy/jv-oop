package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is beginning its loading operation.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is completing its delivery cycle.");
    }
}
