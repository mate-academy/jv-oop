package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Status machine: Truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Status machine: Truck stopped its work");
    }
}
