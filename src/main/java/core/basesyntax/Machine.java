package core.basesyntax;

public abstract class Machine {
    private String machineModel;

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
