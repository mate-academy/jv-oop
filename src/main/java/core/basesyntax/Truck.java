package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("This truck works");
    }
    @Override
    public void stopWork() {
        System.out.println("This truck stopped working");
    }
}
