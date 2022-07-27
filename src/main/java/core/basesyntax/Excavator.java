package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is ready to dig the ground");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator wants to sleep");
    }
}
