package core.basesyntax.machines;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start work Truck");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Truck");
    }
}
