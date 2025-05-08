package core.basesyntax;

public class Bulldozer extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer почав працювати.");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer закінчив працювати.");
    }
}
