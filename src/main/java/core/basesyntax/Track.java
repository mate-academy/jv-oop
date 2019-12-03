package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " is working");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " doesn't work");
    }
}
