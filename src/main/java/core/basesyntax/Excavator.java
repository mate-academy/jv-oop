package core.basesyntax;

public class Excavator extends Machine {
    @Override
    protected void doWork() {
        System.out.println("Excavator START work now");
    }

    @Override
    protected void stopWork() {
        System.out.println("Excavator STOP work now");
    }
}