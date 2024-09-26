package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("VZUH");
    }
    @Override
    public void stopWork() {
        System.out.println("BRUM");
    }
}
