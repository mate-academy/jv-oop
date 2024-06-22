package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(getMachineType() + " is working.");
    }

    @Override
    public void stopWork() {
        System.out.println(getMachineType() + " that has stopped working.");
    }

    @Override
    public String getMachineType() {
        return "Truck";
    }
}
