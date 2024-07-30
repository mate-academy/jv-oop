package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine truck began to transport cargo");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine truck finished to transport cargo and stopped working");
    }
}
