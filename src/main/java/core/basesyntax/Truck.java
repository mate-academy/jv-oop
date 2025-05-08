package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Where are we going?");
    }

    @Override
    public void stopWork() {
        System.out.println("STOPPED.");
    }
}
