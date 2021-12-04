package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println(getName() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stop work!");
    }
}

