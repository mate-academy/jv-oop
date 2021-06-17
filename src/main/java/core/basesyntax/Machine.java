package core.basesyntax;

public abstract class Machine {
    private String model;
    private String fuel;
    private int year;
    private int countWheels;

    public Machine(String model, String fuel, int year, int countWheels) {
        this.setModel(model);
        this.setFuel(fuel);
        this.setYear(year);
        this.setCountWheels(countWheels);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
