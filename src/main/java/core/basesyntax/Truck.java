package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("The Truck started his work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck stopped his work");
    }
}
