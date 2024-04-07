package core.basesyntax;

public class Excavator extends Machine {

    public Excavator() {
        super.setMachineType("Excavator");
    }

    public void doWork() {
        System.out.println(getMachineType() + " started its work");
    }

    public void stopWork() {
        System.out.println(getMachineType() + " stopped working");
    }
}
