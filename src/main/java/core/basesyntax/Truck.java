package core.basesyntax;

public class Truck extends Machine {

    public Truck() {
        super.setMachineType("Truck");
    }

    public void doWork() {
        System.out.println(getMachineType() + " started its work");
    }

    public void stopWork() {
        System.out.println(getMachineType() + " stopped working");
    }
}
