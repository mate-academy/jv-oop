package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck " + getMachineModel() + " starts work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck " + getMachineModel() + " stopped work.");
    }
}
