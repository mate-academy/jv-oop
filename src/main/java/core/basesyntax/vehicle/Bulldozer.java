package core.basesyntax.vehicle;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer clean a mess");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer cleaned up the mess");
    }
}
