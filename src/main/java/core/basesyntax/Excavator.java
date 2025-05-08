package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(super.getName() + " start work");
    }

    @Override
    public void stopWork() {
        System.out.println(super.getName() + " stop work");
    }
}
