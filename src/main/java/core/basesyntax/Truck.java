package core.basesyntax;

public class Truck extends Machine {

    public Truck(String name, boolean working) {
        super(name, working);
    }

    @Override
    public void doWork() {
        System.out.println("Truck: " + getName() + " start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck: " + getName() + " stop work!");
    }
}
