package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String machineType) {
        super(machineType);
    }

    @Override
    public void doWork() {
        System.out.println("Exavator" + " " + machineType + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Exavator" + " " + machineType + " " + "stopped working.");

    }

    @Override
    public String toString() {
        return machineType;
    }
}
