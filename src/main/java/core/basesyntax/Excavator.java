package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.printf("Excavator started its work.");
    }

    @Override
    public void stopWork() {
        System.out.printf("Excavator stopped its work.");
    }
}
