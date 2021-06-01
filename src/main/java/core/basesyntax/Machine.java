package core.basesyntax;

public abstract class Machine {
    private String model;
    private String fuel;
    private int year;
    private int countWheels;

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public int getYear() {
        return year;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public abstract void doWork();

    public abstract void stopWork();
}
