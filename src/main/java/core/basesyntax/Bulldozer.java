package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        sayWork = "Bulldozer started its work";
    }

    @Override
    public void doStopWork() {
        sayStopWork = "Bulldozer stopped its work.";
    }
}
