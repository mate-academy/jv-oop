package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine truck started it`s work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine truck stopped it`s work.");

    }
}
