package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped a work");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is doing a work");
    }
}
