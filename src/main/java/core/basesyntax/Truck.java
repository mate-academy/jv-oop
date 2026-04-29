package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is stopping");
    }
}
