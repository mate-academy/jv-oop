package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.print("Excavator started its work.");
    }

    @Override
    public void stopWork() {
        System.out.print("Excavator stopped its work.");
    }
}

