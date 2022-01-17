package core.basesyntax;

public class Excavator extends Machine {
    @Override
    protected void doWork() {
        System.out.println("Exavator started its work");
    }

    @Override
    protected void stopWork() {
        System.out.println("Exavator stopped its work");
    }
}
