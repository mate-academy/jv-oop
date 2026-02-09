package core.basesyntax;

public class Truck extends Machine {
    public Truck(String truckName) {
        this.name = truckName;
    }

    @Override
    public void doWork() {
        System.out.println(name + " started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped working.");
    }
}
