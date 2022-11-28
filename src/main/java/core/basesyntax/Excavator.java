package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started to load goods.");
    }

    public void stopWork() {
        System.out.println("Excavator finished to load goods.");
    }
}
