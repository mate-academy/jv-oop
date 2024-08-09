package core.basesyntax;

public class Truck extends Machine {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("Truck is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}
