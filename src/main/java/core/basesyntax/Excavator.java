package core.basesyntax;

class Excavator extends Machine {
    @Override
    public void doWork() {
        logStartWork("Excavator");
    }

    @Override
    public void stopWork() {
        logStopWork("Excavator");
    }
}
