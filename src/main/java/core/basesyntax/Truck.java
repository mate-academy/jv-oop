package core.basesyntax;

public class Truck extends Machines{
    @Override
    public void doWork() {
        System.out.println("Truck strted it's work");
    }
    @Override
    public void stopWork() {
        System.out.println("Truck stop it's work");
    }
}
