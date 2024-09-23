package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String machine) {
        super(machine);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator" + " " + machine + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator" + " " + machine + " " + "stopped working.");

    }

    @Override
    public String toString() {
        return "Excavator";
    }
}
