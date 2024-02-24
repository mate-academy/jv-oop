package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        String message = "Truck started to work";
        System.out.println(message);
    }

    @Override
    public void stopWork() {
        String message = "Truck stopped to work";
        System.out.println(message);
    }
}
