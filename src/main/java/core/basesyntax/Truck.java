package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine \"Truck\" started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine \"Truck\"  stopped work");
    }
}
