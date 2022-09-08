package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Mahchine: " + getName() + " is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine: " + getName() + " was stopped");
    }
}

