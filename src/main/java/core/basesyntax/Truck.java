package core.basesyntax;

public class Truck extends Machine {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("The truck doing the work");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck stopped working");
    }
}
