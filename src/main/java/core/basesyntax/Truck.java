package core.basesyntax;

public class Truck extends Machine {

    @Override
    public  void doWork() {
        System.out.println(getBrand() + " " + getModel() + " - went on route!");
    }
    @Override
    public  void stopWork() {
        System.out.println(getBrand() + " " + getModel() + " - went back to the garage!");
    }
}
