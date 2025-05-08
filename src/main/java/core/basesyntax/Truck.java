package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Truck started working");
    }

    @Override
    public void stopWork() {
        System.out.println("This Truck has stopped working");
    }
}
