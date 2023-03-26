package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("A truck start working.");
    }

    @Override
    public void stopWork() {
        System.out.println("An truck finished working.");
    }
}
