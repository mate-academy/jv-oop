package core.basesyntax;

public class Truck extends core.basesyntax.Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Truck started its work");
    }
    @Override
    public void stopWork() {
        System.out.println("Machine Truck stopped its work");
    }
}
