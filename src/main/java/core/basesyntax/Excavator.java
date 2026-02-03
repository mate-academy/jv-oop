package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("the excavator started working");
    }

    @Override
    public void stopWork() {
        System.out.println("the excavator stopped working");
    }
}
