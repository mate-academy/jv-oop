package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm Bulldozer! I'm starting!");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm Bulldozer! I'm stopping.");
    }
}
