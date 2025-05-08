package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldozer has  started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Bulldozer has  stopped it's work");
    }
}
