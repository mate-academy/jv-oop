package core.basesyntax;

public abstract class Machine {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
