package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck: Truck started working");

    }

    @Override
    public void stopWork() {
        System.out.println("Truck: Truck stopped working.");
    }
}
