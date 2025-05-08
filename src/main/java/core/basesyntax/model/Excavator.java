package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished work");
    }
}
