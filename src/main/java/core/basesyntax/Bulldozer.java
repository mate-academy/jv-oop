package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped a work");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is doing a work");
    }
}
