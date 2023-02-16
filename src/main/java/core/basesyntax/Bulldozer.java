package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Kamatsu: " + getPositiveStatus());
    }

    @Override
    public void stopWork() { System.out.println("Kamatsu: " + getNegativeStatus()); }
}
