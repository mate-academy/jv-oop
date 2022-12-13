package core.basesyntax;

public class Excavator extends Machine{
    @Override
    protected void doWork() {
        System.out.println("Excavator started working");
    }

    @Override
    protected void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
