package core.basesyntax;

public class Truck extends Machine{

    @Override
    public void doWork() {
        System.out.println("the truck started it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("the truck stopped it`s work");
    }
}
