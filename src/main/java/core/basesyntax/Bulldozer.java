package core.basesyntax;

public class Bulldozer extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped to work");
    }
}
