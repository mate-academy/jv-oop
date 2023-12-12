package core.basesyntax;

public class Truck extends Machine{


    @Override
    public void doWork() {
        System.out.println("Work Truck");
    }

    @Override
    public void stopWor() {
        System.out.println("Stop work Truck");
    }
}
