package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck start doing his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck start doing his work \n");
    }
}
