package core.basesyntax;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("Truck is working right now.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work.");
    }

}
