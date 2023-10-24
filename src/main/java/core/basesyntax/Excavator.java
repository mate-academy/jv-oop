package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Cat: " + getPositiveStatus());
    }

    @Override
    public void stopWork() {
        System.out.println("Cat: " + getNegativeStatus());
    }
}
