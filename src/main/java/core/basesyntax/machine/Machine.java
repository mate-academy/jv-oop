package core.basesyntax.machine;

public abstract class Machine {
    private String serialNumber;

    public abstract void doWork();

    public abstract void stopWork();

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
