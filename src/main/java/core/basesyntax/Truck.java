package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Started its work truck");
    }

    @Override
    public void stopWork() {
        System.out.println("Completed its work truck");

    }
}
