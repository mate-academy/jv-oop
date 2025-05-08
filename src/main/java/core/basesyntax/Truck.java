package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track: Do work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track: Stop work");
    }
}
