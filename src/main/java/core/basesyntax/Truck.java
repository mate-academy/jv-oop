package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " started to work!");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stopped to work!");
    }
}
