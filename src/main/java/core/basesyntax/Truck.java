package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("the Truck is working");
    }

    @Override
    public void stopWork() {
        System.out.println("the Truck is not working");
    }
}
