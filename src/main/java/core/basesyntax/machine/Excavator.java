package core.basesyntax.machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator has started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped work");
    }
}
