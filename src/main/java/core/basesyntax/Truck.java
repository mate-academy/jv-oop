package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has just started it's work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has just stopped it's work.");
    }
}
