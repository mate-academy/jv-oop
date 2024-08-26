package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("it's a Truck that works");
    }

    @Override
    public void stopWork() {
        System.out.println("is a Truck that does not work");
    }
}
