package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void startWork() {
        System.out.println("Truck start");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop");
    }
}
