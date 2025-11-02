package core.basesyntax;

public abstract class Machine {
    protected static final String DO_WORK_MESSAGE = " started its work!";
    protected static final String STOP_WORK_MESSAGE = " stopped working!";

    public abstract void doWork();

    public abstract void stopWork();
}
