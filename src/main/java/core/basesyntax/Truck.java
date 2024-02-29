package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck start working");
    }
    // added one comment
    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}
