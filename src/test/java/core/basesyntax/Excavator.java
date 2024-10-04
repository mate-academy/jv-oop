package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println(getName() + " Excavator started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " Excavator finished my work.");
    }
}
