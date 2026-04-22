package core.basesyntax;

public class Bulldozer extends Machine {
    private static final String name = "Buldozer";

    @Override
    public void doWork() {
        System.out.println(name + " is working.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stoped working.");
    }
}
