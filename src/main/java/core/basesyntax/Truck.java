package core.basesyntax;

public class Truck extends Machine {

    private static final String name = "Truck";

    public Truck() {

    }

    @Override
    public void doWork() {
        System.out.println(name + " start working!");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stop working!");
    }
}
