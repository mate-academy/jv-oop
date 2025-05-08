package core.basesyntax;

public class Truck extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Truck  почав працювати.");
    }
    @Override
    public void stopWork() {
        System.out.println("Truck закінчив працювати.");
    }
}
