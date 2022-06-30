package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Excavator started work");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Excavator stopped work");
    }
}
