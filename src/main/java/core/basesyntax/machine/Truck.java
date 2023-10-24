package core.basesyntax.machine;

public class Truck extends Machine {
    @Override
    public void doWork() {

        System.out.println("Truck is doing its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped its work!");
    }
}
