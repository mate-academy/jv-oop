package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("truck is starting to work");
    }

    @Override
    public void stopWork() {
        System.out.println("truck is stopped");
    }
}
