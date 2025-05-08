package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("truck started its work");
    }

    public void stopWork() {
        System.out.println("truck finished its work");
    }
}
