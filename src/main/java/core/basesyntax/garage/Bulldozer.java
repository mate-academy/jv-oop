package core.basesyntax.garage;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is now working.");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped working.");
    }
}
