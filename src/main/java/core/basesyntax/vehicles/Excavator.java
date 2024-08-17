package core.basesyntax.vehicles;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator is working");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator is stopped");
    }
}
