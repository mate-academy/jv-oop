package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("An excavator start working.");
    }

    @Override
    public void stopWork() {
        System.out.println("An excavator finished working.");
    }
}
