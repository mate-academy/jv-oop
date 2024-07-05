package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is starting its digging operation.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is shutting down after completing its digging cycle.");
    }
}
