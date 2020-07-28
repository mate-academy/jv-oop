package core.basesyntax;

public abstract class Machine {

    protected String machineTitle;

    public Machine(String machineTitle) {
        this.machineTitle = machineTitle;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
