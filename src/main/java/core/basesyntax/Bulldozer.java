package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello");
    }

    @Override
    public void stopWork() {
        System.out.println("Goodnight");
    }
}
