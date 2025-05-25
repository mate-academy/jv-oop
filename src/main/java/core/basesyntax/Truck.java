package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void stopWork() {
        System.out.println("stopped work, Truck");
    }

    @Override
    public void doWork() {
        System.out.println("started work, Truck");
    }
}
