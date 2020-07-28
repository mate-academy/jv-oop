package core.basesyntax.cars;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator STARTED working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator STOP working!");
    }
}
