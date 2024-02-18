package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("excavator start work");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator stop work");
    }

}
