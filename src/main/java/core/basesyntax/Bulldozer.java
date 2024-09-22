package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String machine) {
        super(machine);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer" + " " + machine + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer" + " " + machine + " " + "stopped working.");
    }
    @Override
    public String toString() {
        return machine;
    }
}
