package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator has stopped it's work");
    }
}
