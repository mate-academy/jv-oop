package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck is already working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck is not working.");
    }
}
