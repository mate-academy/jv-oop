package core.basesyntax;

/**
 * The class describes the technique with which we can work.
 */
public abstract class Machine {
    //These are templates for the second parts of messages.
    protected final String messageDoWork = " does the job.";
    protected final String messageStopWork = " finished job.";

    //METHODS
    public abstract void doWork();

    public abstract void stopWork();
}
