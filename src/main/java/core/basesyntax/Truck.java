package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.print("Truck started its work.");
    }

    @Override
    public void stopWork() {
        System.out.print("Truck stopped its work.");
    }
}
