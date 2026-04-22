package core.basesyntax;

public class Truck extends Machine {
    private static final String name = "Truck";

    @Override
    public void doWork() {
        System.out.println(name + " is working.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stoped working.");
    }
}
