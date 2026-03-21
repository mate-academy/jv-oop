package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(new Excavator() + " has started working!");
    }

    @Override
    public void stopWork() {
        System.out.println(new Excavator() + " has stopped working!");
    }
}
