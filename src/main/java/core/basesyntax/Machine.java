package core.basesyntax;

public abstract class Machine {
    private int tankSize;
    private String model;

    public String doWork() {
        return null;
    }

    public String stopWork() {
        return null;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
