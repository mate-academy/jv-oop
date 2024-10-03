package core.basesyntax;

public class Truck extends Machine {
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working. ");

    }
}
