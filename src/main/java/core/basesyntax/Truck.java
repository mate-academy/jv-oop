package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Truck start to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Truck stop to work");
    }
}
