package core.basesyntax;

public class Excacator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excacator started work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excacator stopped work.");
    }
}
