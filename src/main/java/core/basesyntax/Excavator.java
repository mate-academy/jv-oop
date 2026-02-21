package core.basesyntax;

public class Excavator extends Machine {

    private static final String name = "Excavator";

    public Excavator() {

    }

    @Override
    public void doWork() {
        System.out.println(name + " start working!");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stop working!");
    }
}
