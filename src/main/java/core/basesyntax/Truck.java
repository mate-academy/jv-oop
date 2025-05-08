package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its works");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its works");
    }
}
