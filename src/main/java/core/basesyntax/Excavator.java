package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine excavator started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine excavator stopped working.");
    }
}
