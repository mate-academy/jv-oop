package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Excavator stop work");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator start work");
    }
}
