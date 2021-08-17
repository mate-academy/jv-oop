package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Excavator is finished");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started working");
    }
}
