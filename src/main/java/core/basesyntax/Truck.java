package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void stopWork() {
        System.out.println("The truck has finished working");
    }

    @Override
    public void doWork() {
        System.out.println("The truck starts working");
    }
}
