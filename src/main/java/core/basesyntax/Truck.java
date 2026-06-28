package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("The Truckg has been started.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck has been stopped.");
    }
}
