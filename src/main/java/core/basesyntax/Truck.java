package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck starts work hard!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stops working!");
    }
}
