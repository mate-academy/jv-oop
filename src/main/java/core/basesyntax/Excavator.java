package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator " + getName() + " stop working!");
    }

}
