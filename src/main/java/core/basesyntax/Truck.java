package core.basesyntax;

public class Truck extends Machines {
    @Override
    public void doWork() {
        System.out.println("Truck start to working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop working");
    }
}
