package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start Excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop Excavator");
    }
}
