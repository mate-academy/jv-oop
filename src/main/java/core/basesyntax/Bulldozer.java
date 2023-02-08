package core.basesyntax;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer finish work!");
    }
}
