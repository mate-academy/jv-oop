package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator has just started working, so  it's working right now!");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator has just stopped working!");
    }
}
