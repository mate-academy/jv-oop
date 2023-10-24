package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The engine started. The excavator started moving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The engine was turned off. The excavator stopped.");
    }
}
