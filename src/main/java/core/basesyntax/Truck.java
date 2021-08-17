package core.basesyntax;

public class Truck extends Machine {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("Truck" + super.getName() + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck" + super.getName() + " stopped its work.");
    }
}
