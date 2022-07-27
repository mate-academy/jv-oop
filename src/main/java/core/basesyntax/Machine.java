package core.basesyntax;

public abstract class Machine {
    public abstract void doWork();

    public abstract void stopWork();

    @Override
    public String toString() {
        return "Machine{}";
    }
}
