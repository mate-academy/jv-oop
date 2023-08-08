package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine started");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stopped");
    }
}
