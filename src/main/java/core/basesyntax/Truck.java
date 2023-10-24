package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started it's work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped it's work!");
    }
}
