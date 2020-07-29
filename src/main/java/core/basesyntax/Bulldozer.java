package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("The bulldozer started digging up a quarry.");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped digging up a quarry.");
    }
}
