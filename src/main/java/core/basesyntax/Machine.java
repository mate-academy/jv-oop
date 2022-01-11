package core.basesyntax;

public abstract class Machine {
    public String sayWork;
    public String sayStopWork;

    public abstract void doWork();

    public abstract void doStopWork();
}
