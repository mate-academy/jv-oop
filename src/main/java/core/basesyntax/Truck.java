package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " is started work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " is stopped working");
    }
}
