package core.basesyntax.machines;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator has started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator finished working.");
    }
}
