package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " does the Work!");
    }
    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " stops the Work!");
    }
}
