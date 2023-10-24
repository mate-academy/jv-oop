package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck began transporting cargo");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has finished transporting cargo");
    }
}
