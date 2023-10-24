package core.basesyntax;

public abstract class Machine {
    private String machineName;

    public void setMachineName(String name) {
        this.machineName = name;
    }

    public String getMachineName() {
        return machineName;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
