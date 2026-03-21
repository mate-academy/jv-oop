package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(new Bulldozer() + " has started working!");
    }

    @Override
    public void stopWork() {
        System.out.println(new Bulldozer() + " has stopped working!");
    }
}
