package core.basesyntax;

public abstract class Machine {
    protected String machineType;

    public Machine(String machineType) {
        this.machineType = machineType;
    }

    public abstract void doWork();

    public abstract void stopWork();

    @Override
    public String toString() {
        return machineType;
    }
}

