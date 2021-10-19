package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine was started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine did not work");
    }
}
