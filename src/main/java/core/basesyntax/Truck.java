package core.basesyntax;

public class Truck extends Machine {
    @Override
    public char doWork() {
        System.out.println("Truck started its work");
        return 0;
    }

    @Override
    public char stopWork() {
        System.out.println("Truck stopped its work");
        return 0;
    }
}
