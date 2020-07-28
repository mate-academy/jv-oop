package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String brand, int yearOfProduction, int carMileage) {
        super(brand, yearOfProduction, carMileage);
    }

    @Override
    void doWork() {
        System.out.println("Excavator starts working");
    }

    void stopWork() {
        System.out.println("Excavator stops working");
    }
}
