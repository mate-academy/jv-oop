package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck is started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck is stopped to work");
    }
}
