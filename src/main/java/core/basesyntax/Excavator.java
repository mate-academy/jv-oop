package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Excavator has started");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Excavator has stopped it's work");
    }
}
