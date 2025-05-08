package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts 'dozing big time");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops 'dozing at all");
    }
}
