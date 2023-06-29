package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started work!");
    }

    @Override
    public void stoppWork() {
        System.out.println("Excavator stopped work!");
    }
}
