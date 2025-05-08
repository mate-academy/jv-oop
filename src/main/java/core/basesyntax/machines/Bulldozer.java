package core.basesyntax.machines;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer! Started work...");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer! Stopped work...");
    }

}
