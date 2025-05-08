package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck does work: truck truck truck");
    }

    public void stopWork() {
        System.out.println("Truck stops work");
    }
}
