package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine excavator started it`s work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine excavator stopped it`s work.");

    }
}
