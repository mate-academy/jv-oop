package core.basesyntax;

public class Truck extends Machine{
    @Override
    public String toString() {
        return super.toString();
    }

    public void doWork() {
        System.out.println("Truck started working");
    }

    public void stopWork() {
            System.out.println("Truck stopped working");
    }
}

