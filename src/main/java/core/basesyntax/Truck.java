package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck Start Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck Stop Work");
    }
}
