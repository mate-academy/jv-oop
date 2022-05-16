package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work truck");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop worked truck");
    }
}
