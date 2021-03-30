package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck started its operations");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck terminated its operations");
    }

}
