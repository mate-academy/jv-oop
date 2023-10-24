package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator works!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavators stopped!");
    }
}
