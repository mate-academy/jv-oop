package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Attention, the Excavator will start working soon");
    }

    @Override
    public void stopWork() {
        System.out.println("Attention, the Excavator will stop working soon");
    }
}
