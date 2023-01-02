package core.basesyntax;

public class Truck extends Machine {
    private String truckName = "Truck";

    @Override
    public void doWork() {
        System.out.println(truckName + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(truckName + " finished its work");
    }
}
