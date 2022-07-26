package core.basesyntax;

/**
 * The class describes the technique with which we can work.
 */
public abstract class Machine {
    //These are templates for the second parts of messages.
    protected final static String MESSAGE_DO_WORK = " does the job.";
    protected final static String MESSAGE_STOP_WORK = " finished job.";

    //METHODS
    public abstract void doWork();
    public abstract void stopWork();
}
