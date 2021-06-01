package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Brm-bm-bm! Machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stopped its work");
    }
}
