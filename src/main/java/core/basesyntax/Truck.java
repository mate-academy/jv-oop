package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("It is necessary to take out 40 tons of soil.");
    }

    @Override
    public void stopWork() {
        System.out.println("We stop work.");
    }
}
