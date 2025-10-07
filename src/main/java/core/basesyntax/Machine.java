package core.basesyntax;

/**
 * Represents a generic machine capable of performing work.
 *
 * Subclasses should implement {@link #doWork()} and {@link #stopWork()} to
 * define specific start/stop behavior.
 */
public abstract class Machine {

    /**
     * Starts the machine's work process.
     */
    public abstract void doWork();

    /**
     * Stops the machine's work process.
     */
    public abstract void stopWork();
}
