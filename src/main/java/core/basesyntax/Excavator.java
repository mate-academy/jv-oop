package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Excavator start to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Excavator stop to work");
    }
}
