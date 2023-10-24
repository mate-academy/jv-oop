package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work was started by a truck.");
    }

    @Override
    public void stopWork() {
        System.out.println("Work was stopped by a truck.");
    }
}
