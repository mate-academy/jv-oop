package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Truck stopped its work");
    }
}
