package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator work");
    }

    @Override
    public void spotWork() {
        System.out.println("Excavator stops work");
    }
}
