package core.basesyntax;

public abstract class Machine {
    private String brand;
    private String model;

    public Machine() {
    }

    public Machine(String brandMachine, String modelMachine) {
        this.brand = brandMachine;
        this.model = modelMachine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
