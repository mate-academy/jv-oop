package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " started to work");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " stopped work");
    }
}
