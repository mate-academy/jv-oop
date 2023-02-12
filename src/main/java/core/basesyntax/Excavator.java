package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {

    }

    @Override
    public void stopWork() {
        System.out.println("Cat: " + getNegativeStatus());
    }
}
