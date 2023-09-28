package core.basesyntax;

public abstract class Machine {
    private String model;
    private String fuel;
    private double engineCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity < 0) {
            System.out.println("Negative value can`t be set");
        }
        this.engineCapacity = engineCapacity;
    }

    public Machine(String model, String fuel, double engineCapacity) {
        this.model = model;
        this.fuel = fuel;
        this.engineCapacity = engineCapacity;

    }
    public abstract void doWork();

    public abstract void stopWork();
}
