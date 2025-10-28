package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("The machine starts working.");
    }

    @Override
    public void stopWork() {
        System.out.println("The machine stops working.");
    }
}
