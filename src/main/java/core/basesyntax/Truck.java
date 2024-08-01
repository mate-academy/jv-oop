package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is now working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped working");
    }
}
