package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        sayWork = "Truck started its work";
    }

    @Override
    public void doStopWork() {
        sayStopWork = "Truck stopped its work.";
    }
}
