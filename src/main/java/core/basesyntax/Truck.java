package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck have started it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck have just stopped it`s work");
    }
}
