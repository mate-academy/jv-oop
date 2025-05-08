package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has finished working");
    }
}
