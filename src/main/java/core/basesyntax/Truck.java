package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has just started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck was stopped");
    }
}
