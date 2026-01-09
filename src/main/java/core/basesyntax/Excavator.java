package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("doWork excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("stopWork excavator");
    }
}
