package core.basesyntax;

public class Truck extends Machine {
    private String truckName;

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }
    public Truck(String truckName) {
        this.truckName = truckName;
    }

    @Override
    public void doWork() {
        System.out.println(truckName + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(truckName + " has stopped working");
    }
}
