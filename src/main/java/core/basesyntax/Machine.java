package core.basesyntax;

public abstract class Machine {

    private String machineType;

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
