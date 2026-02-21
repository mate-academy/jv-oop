package core.basesyntax;

public class Bulldozer extends Machine {

    private static final String name = "Bulldozer";

    public Bulldozer() {

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
