package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck " + this + " started");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck " + this + " stopped");
    }
}
