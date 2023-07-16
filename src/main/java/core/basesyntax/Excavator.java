package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        printStartMessage(getClass().getSimpleName());
    }

    @Override
    public void stopWork() {
        printStopMessage(getClass().getSimpleName());
    }
}
