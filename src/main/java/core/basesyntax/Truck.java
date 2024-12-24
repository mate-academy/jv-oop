package core.basesyntax;

public final class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Wruuum!");
    }

    @Override
    public void stopWork() {
        System.out.println("Shhhh");
    }
}
