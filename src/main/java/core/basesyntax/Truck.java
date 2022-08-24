package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("Truck start works");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop works");
    }
}
