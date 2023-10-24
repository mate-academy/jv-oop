package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is working good ");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has to be stopped and fixed ");
    }
}
