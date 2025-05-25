package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void stopWork() {
        System.out.println("stopped work, Excavator");
    }

    @Override
    public void doWork() {
        System.out.println("started work, Excavator");
    }
}
