package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }

    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " started working");
    }
}
