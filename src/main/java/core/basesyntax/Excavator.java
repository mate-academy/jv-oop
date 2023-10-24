package core.basesyntax;

public class Excavator extends Machine {
    @Override

    public void doWork() {
        System.out.println("Excavator started at Work!");
    }

    @Override

    public void stopWork() {
        System.out.println("Excavator stopped at Work!");
    }
}
