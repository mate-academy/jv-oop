package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is work");
    }

    public void stopWork() {
        System.out.println("Bulldozer isn't work");
    }
}
