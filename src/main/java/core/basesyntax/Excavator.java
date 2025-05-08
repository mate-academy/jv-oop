package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts doing its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops doing its work!");
    }
}
