package core.basesyntax.machines;

public abstract class Machine {
    private boolean isWorking;
    private int machineID;

    protected int getMachineID() {
        return machineID;
    }

    protected void setMachineID(int machineID) {
        if (machineID > 0) {
            this.machineID = machineID;
        }
    }

    protected boolean isWorking() {
        return isWorking;
    }

    protected void setWorking(boolean working) {
        isWorking = working;
    }

    public abstract void doWork();

    public abstract void stopWork();

}
