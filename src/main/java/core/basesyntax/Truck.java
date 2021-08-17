package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck start doing its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop doing its work.");
    }
}
