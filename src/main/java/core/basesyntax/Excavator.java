package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("An excavator started doing its work");
    }

    @Override
    public void stopWork() {
        System.out.println("An excavator stopped doing its work");
    }
}
