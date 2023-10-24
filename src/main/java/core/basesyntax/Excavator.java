package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator is already working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator is not working.");
    }

}
