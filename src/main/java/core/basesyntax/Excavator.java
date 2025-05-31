package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("\nThe Excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("\nThe Excavator stopped its work");
    }
}
