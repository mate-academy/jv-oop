package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started leveling of cargo.");
    }

    public void stopWork() {
        System.out.println("Bulldozer finished leveling of cargo");
    }
}
