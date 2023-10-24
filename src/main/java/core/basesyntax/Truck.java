package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public void doStopWork() {
        System.out.println("Truck stopped its work.");
    }
}
