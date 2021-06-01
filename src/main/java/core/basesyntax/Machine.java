package core.basesyntax;

public abstract class Machine {
    String model;
    String fuel;
    int year;
    int countWheels;
    public abstract void doWork();
    public abstract void stopWork();
}
