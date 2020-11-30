package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " has started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " has stopped its work");
    }
}
