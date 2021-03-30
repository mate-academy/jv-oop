package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is working now");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped the work");
    }
}
