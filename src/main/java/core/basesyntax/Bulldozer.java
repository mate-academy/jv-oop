package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer: GO WORK!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer: STOP WORK.");
    }
}