package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " start work");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " stop work");
    }
}
