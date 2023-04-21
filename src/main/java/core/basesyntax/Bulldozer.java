package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Starts 'dozing big time");
    }

    @Override
    public void stopWork() {
        System.out.println("Stops 'dozing at all");
    }
}
