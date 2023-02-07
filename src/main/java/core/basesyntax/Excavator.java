package core.basesyntax;

public class Excavator extends Machine{

    @Override
    public void doWork() {
        System.out.printf("%s is starting!\n", getClass().getSimpleName());
    }

    @Override
    public void stopWork() {
        System.out.printf("%s is stopping!\n", getClass().getSimpleName());
    }
}
