package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator is now operational.");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator has ceased operations.");
    }
}
