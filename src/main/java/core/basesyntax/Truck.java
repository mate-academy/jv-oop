package core.basesyntax;

public abstract class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Truck is start work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Truck is stop work!");
    }
}
