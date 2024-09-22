package core.basesyntax;

public class Truck extends Machine {

    public Truck(String machineType) {
        super(machineType);
    }

    @Override
    public void doWork() {
        System.out.println("Truck" + " " + machineType + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck" + " " + machineType + " " + "stopped working. ");

    }

    @Override
    public String toString() {
        return machineType;
    }
}
