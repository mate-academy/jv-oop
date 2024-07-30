package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine excavator started digging");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine excavator finished digging and stopped working");
    }
}
