package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Bulldozer is finished");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started working");
    }
}
