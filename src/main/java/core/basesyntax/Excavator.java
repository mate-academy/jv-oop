package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator stars it`s works.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working.");
    }
}
