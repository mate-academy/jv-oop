package core.basesyntax;

public class Truck extends Machine {
    @Override
    public boolean doWork() {
        System.out.println("Truck started his work");
        return false;
    }

    @Override
    public boolean stopWork() {
        System.out.println("Truck stoped his work");
        return false;
    }

}
