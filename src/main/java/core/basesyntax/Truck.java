package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm a truck, let's start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck will shut down now...");
    }
}
