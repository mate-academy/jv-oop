package core.basesyntax;

public class Excavator extends Machine {
    private static final String name = "Excavator";

    @Override
    public void doWork() {
        System.out.println(name + " is working.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stoped working.");
    }
}
