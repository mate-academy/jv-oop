package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName()
                + ": "
                + "Truck start working");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName()
                + ": "
                + "Truck stop working");
    }
}
