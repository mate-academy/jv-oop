package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String machine) {
        super(machine);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer" + " " + machine + " " + "is moving earth.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer" + " " + machine + " " + "has finished moving earth.");
    }

    @Override
    public String toString() {
        return "Bulldozer";
    }
}
