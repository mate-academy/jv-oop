package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work.");
    }

    @Override
    public void doWork() {
        System.out.println("Truck started its work.");

    }
}
