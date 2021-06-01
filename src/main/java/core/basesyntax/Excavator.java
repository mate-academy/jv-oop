package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped work!");
    }
}
