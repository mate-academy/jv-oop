package core.basesyntax.model;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has just started working, so  it's working right now!");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has just stopped working!");
    }
}
