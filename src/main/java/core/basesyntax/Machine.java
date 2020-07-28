package core.basesyntax;

public abstract class Machine {
    String brand;
    int yearOfProduction;
    int carMileage;

    public Machine(String brand, int yearOfProduction, int carMileage) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.carMileage = carMileage;
    }

    abstract void doWork();

    abstract void stopWork();
}
