package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(new Truck() + " has started working!");
    }

    @Override
    public void stopWork() {
        System.out.println(new Truck() + " has stopped working!");
    }
}
