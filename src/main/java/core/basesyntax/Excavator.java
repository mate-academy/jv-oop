package core.basesyntax;

public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator has started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
