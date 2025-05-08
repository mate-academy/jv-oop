package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        printStartMessage(getClass().getSimpleName());
    }

    @Override
    public void stopWork() {
        printStopMessage(getClass().getSimpleName());
    }
}
