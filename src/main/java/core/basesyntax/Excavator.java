package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Status machine: Excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Status machine: Excavator stopped its work");
    }
}
