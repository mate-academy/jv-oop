package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is doing something excavator specific");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped");
    }
}
