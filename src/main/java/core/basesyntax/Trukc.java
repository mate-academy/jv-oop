package core.basesyntax;

public class Trukc extends Macine {
    public void doWork() {
        System.out.println("Truck start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck work stop");
    }

}
