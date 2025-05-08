package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer() {
        super.setMachineType("Bulldozer");
    }

    public void doWork() {
        System.out.println(getMachineType() + " started its work");
    }

    public void stopWork() {
        System.out.println(getMachineType() + " stopped working");
    }
}
