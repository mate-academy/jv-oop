package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Excavator started working");

    }

    @Override
    public void stopWork() {
        System.out.println("This Excavator has stopped working");
    }
}
