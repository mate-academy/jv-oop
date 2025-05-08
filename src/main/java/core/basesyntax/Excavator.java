package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("I'm an excavator, let's start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator will shut down now...");
    }
}
