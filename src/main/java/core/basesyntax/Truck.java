package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(name + " has started it's work.");
    }
    @Override
    public void stopWork() {
        System.out.println(name + " ended it's work.");
    }
}
