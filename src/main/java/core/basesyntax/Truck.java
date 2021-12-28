package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The " + getEngine() + " its work. ");
    }

    @Override
    public void stopWork() {
        System.out.println(getEngine() + "work.");
    }
}
