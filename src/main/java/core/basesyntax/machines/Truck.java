package core.basesyntax.machines;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track delivering 'Coca-cola'.");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop working.");
    }
}
