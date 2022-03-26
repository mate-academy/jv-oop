package core.basesyntax.model;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck starts work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work!");
    }
}
