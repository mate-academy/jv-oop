package core.basesyntax;

public class Excavator extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Excavator почав працювати.");
    }
    @Override
    public void stopWork() {
        System.out.println("Excavator закінчив працювати.");
    }
}
