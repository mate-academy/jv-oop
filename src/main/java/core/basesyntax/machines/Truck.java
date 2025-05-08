package core.basesyntax.machines;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(("Truck started doing its work"));
    }

    @Override
    public void stopWork() {
        System.out.println(("Truck stopped doing its work"));
    }
}
