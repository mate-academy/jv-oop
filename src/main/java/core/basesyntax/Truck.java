package core.basesyntax;

public abstract class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Truck started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Truck stopped work!");
    }
}
