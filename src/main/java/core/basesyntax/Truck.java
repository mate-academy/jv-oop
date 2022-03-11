package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck do his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop his work");
    }
}

