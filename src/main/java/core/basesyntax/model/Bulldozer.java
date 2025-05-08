package core.basesyntax.model;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer has just started working, so  it's working right now!");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer has just stopped working!");
    }
}
