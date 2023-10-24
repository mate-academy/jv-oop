package core.basesyntax;

/**
 * The class defines the type of machine - a bulldozer.
 */
public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work.");
    }
}
