package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.printf("Truck started its work.");
    }

    @Override
    public void stopWork() {
        System.out.printf("Truck stopped its work.");
    }
}
