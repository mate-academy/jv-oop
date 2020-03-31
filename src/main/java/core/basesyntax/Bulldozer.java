package core.basesyntax;

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        logStartWork("Bulldozer");
    }

    @Override
    public void stopWork() {
        logStopWork("Bulldozer");
    }
}
