package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts doing it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops doing it`s work");
    }
}
