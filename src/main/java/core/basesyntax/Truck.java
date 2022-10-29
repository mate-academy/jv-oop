package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Truck is working now!");
    }
    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Truck stops working!");
    }

}
