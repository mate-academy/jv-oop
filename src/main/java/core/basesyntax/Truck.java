package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The engine started. The truck started moving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The engine was turned off. The truck stopped.");
    }
}
