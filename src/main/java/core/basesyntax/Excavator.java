package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Excavator starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Excavator stops working");
    }
}
