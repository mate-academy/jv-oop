package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck have started its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck have stopped its work!");
    }
}
