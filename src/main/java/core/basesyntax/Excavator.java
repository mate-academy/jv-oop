package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator has started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator has stopped working!");
    }
}
