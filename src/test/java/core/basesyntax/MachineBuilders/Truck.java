package core.basesyntax.MachineBuilders;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("Truck start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop work");
    }
}
