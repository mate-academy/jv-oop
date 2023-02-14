package core.basesyntax;

public class Truck extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Truck started working");
        return false;
    }

    public void stopWork() {
        System.out.println("Truck started working");
    }
}
