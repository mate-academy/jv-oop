package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("A truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("A truck stopped its work");
    }
}
