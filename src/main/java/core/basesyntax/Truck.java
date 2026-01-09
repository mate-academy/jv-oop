package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("doWork truck");
    }

    @Override
    public void stopWork() {
        System.out.println("stopWork truck");
    }
}
