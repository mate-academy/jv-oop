package core.basesyntax.machines;

public abstract class Machine {
    private boolean isWorking;
    private int machineId;

    public Machine(int id) {
        try {
            setMachineId(id);
        } catch (Exception e) {
            System.out.println("Wrong ID");
        }
    }

    protected int getMachineId() {
        return machineId;
    }

    protected void setMachineId(int machineId) throws Exception {
        if (machineId > 0) {
            this.machineId = machineId;
            return;
        }
        throw new Exception("Id should be not less than 0");
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
