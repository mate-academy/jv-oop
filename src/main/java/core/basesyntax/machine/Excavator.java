package core.basesyntax.machine;

public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
