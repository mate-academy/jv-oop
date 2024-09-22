package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String machineType) {
        super(machineType);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer" + " " + machineType + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer" + " " + machineType + " " + "stopped working.");
    }

    @Override
    public String toString() {
        return machineType;
    }
}
