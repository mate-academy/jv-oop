package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator starts to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavatorr stops to work.");
    }
}
