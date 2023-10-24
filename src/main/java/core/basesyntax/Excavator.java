package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The engine started. The Excavator is driving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator stopped. Turn off the engine.");
    }
}
