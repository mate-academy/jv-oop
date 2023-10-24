package core.basesyntax.machines;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start work Excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Excavator");
    }
}
