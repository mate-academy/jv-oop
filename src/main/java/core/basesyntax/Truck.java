package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("Brum-Brum");
    }
    @Override
    public void stopWork() {
        System.out.println("The Truck stopped working");
    }
}
