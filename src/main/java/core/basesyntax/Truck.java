package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " is driving.");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " has stopped driving.");
    }
}
