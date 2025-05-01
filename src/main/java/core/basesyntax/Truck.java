package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Driving a truck do Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Driving a truck stop Work");
    }
}
