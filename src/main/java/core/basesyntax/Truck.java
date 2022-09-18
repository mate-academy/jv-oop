package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start work truck");
    }
    @Override
    public void stopWork() {
        System.out.println("Stop work truck");
    }
}
