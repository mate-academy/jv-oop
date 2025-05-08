package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck is working now");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck stops working");
    }
}
