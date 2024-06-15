package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator is now working.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator has stopped working and is now idle.");
    }
}
