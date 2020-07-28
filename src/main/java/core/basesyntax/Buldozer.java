package core.basesyntax;

public class Buldozer extends Machine {

    public Buldozer(String brand, int yearOfProduction, int carMileage) {
        super(brand, yearOfProduction, carMileage);
    }

    @Override
    void doWork() {
        System.out.println("Buldozer starts working");
    }

    void stopWork() {
        System.out.println("Buldozer stops working");
    }
}
