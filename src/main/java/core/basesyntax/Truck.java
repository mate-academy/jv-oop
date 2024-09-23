package core.basesyntax;

public class Truck extends Machine {

    public Truck(String machine) {
        super(machine);
    }

    @Override
    public void doWork() {
        System.out.println("Truck" + " " + machine + " " + "started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck" + " " + machine + " " + "stopped working. ");

    }

    @Override
    public String toString() {
        return "Truck";
    }
}
