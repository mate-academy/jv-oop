package core.basesyntax;

public abstract class Machine {
    protected final String messageDoWork = " does the job.";
    protected final String messageStopWork = " finished job.";

    public abstract void doWork();

    public abstract void stopWork();
}
