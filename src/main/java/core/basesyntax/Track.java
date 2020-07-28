package core.basesyntax;

public class Track extends Machine {

    public Track(String brand, int yearOfProduction, int carMileage) {
        super(brand, yearOfProduction, carMileage);
    }

    @Override
    void doWork() {
        System.out.println("Track starts working");
    }

    void stopWork() {
        System.out.println("Track stops working");
    }
}
