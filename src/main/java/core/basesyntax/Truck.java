package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {

        System.out.println("\nTruck is starting it's work now!\n");

    }

    @Override
    public void stopWork() {

        System.out.println("\nTruck is not available now!\n");

    }

}
