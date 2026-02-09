package core.basesyntax;

public class Truck extends Machine {
    public Truck(String truckName) {
        this.name = truckName;
    }

    @Override
    public void doWork() {
        System.out.println("Machine " + name + " is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine " + name + " is not working");
    }
}
