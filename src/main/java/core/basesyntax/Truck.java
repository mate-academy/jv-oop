package core.basesyntax;

public class Truck extends Machine {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("The truck " + '"' + getName() + '"' + " started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck " + '"' + getName() + '"' + " finished work.\n");
    }
}
