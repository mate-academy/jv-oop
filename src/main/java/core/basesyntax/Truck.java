package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("It is necessary to take out 40 tons of soil. We start work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Run out of fuel. We stop work.");
    }
}