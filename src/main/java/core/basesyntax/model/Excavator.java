package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work");
    }
}
