package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck starts working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck has finished its work!");
    }
}
