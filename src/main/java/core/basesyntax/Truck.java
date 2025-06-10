package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Attention, the Truck will start working soon");
    }

    @Override
    public void stopWork() {
        System.out.println("Attention, the Truck will stop working soon");
    }
}
