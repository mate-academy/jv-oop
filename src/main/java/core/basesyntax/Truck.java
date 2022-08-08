package core.basesyntax;

public class Truck extends Machine{
    public void doWork() {
        System.out.println("The Truck started work");
    }
    @Override
    public void stopWork() {
        System.out.println("The Truck stopped work");
    }
}
