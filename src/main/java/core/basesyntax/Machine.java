package core.basesyntax;

abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();

    protected void logStartWork(String machineName) {
        System.out.println(machineName + " start work!");
    }

    protected void logStopWork(String machineName) {
        System.out.println(machineName + " stop work!");
    }
}
