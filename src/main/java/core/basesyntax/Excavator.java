package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        sayWork = "Excavator started its work";
    }

    @Override
    public void doStopWork() {
        sayStopWork = "Excavator stopped its work.";
    }
}
