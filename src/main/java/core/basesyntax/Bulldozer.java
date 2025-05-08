package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is moving earth");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has finished moving earth");
    }
}
