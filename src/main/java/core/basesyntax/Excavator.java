package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String name, int year, String colour) {
        super(name, year);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started its work");

    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work");

    }
}
