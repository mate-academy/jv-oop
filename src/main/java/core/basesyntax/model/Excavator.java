package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Beginning of work Excavator!");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Excavator!");
    }
}
