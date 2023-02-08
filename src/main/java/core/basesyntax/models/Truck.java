package core.basesyntax.models;
public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has done its work");
    }
}
