package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started its work excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("Completed its work excavator");
    }
}
