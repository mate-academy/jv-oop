package core.basesyntax;

public class Truck extends Machine {
    private final String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is transporting large amounts of goods");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " has stopped transporting large amounts of goods");
    }
}
