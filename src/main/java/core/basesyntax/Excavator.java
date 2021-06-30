package core.basesyntax;

public class Excavator extends Machine {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopped");
    }
}
