package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is working now");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped the work");
    }
}
