package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(" run Excavator ");
    }

    @Override
    public void stopWork() {
        System.out.println(" stop Excavator ");
    }
}
