package core.basesyntax;

public class Truck extends Machine {
    private final String name;
    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " started work");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped work");
    }
}
