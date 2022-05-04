package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Truck left for its destination");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck arrived at its destination");

    }
}
