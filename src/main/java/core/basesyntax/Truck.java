package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started the work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has finished the work");
    }
}
