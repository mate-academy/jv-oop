package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer has now started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer's operation was suspended");
    }
}
