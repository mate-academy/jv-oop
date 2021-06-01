package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Fire in the hole!");
    }

    @Override
    public void stopWork() {
        System.out.println("Roger That");
    }
}
