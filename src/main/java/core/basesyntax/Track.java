package core.basesyntax;

class Track extends Machine {
    @Override
    public void doWork() {
        logStartWork("Track");
    }

    @Override
    public void stopWork() {
        logStopWork("Track");
    }
}
