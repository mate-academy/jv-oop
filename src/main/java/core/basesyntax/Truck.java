package core.basesyntax;

public class Truck extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Truck started his work");
        return true;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Truck stopped his work");
        return true;
    }

}
