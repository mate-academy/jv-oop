package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starting it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator ended it's work");
    }
}
