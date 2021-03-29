package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work");
    }
}
