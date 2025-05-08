package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator was started it's work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator was stopped it's work!");
    }
}
