package core.basesyntax;

public class Truck implements Machine {
    @Override
    public void doWork() {
        System.out.println("Truck working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped");
    }
}
