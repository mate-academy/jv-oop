package core.basesyntax.models;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started doing work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped doing work.");
    }
}
