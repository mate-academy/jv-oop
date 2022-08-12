package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started its work.");
    }

    @Override
    public void stopWork() {
        super.stopWork();
        System.out.println("Excavator stopped its work.");

    }
}
