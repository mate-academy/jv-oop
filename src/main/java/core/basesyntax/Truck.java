package core.basesyntax;

public class Truck extends Machine {
    @Override
    protected void doWork() {
        System.out.println("Truck START work now");
    }

    @Override
    protected void stopWork() {
        System.out.println("Truck STOP work now");
    }
}