package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started to work");
        System.out.println("Truck now is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck finished all his tasks for today");
        System.out.println("Truck stopped to work");
    }
}
