package core.basesyntax;

public class Truck extends Machine {

    @Override
    protected void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    protected void stopWork() {
        System.out.println("Truck stopped its work");
    }
}
