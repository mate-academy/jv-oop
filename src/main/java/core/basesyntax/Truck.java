package core.basesyntax;

public class Truck extends Machine {
    private int truckNumber;

    public Truck(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    public int getTruckNumber() {
        return truckNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck #" + getTruckNumber() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck #" + getTruckNumber() + " finish work!");
    }
}
