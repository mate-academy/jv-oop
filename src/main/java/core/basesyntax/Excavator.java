package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("excavator is starting to work");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator is stopped");
    }
}
