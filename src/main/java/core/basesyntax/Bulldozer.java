package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("I'm a bulldozer, let's start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is shutting down now...");
    }
}
